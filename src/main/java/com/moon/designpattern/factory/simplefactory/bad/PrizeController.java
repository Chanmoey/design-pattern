package com.moon.designpattern.factory.simplefactory.bad;

import com.alibaba.fastjson.JSON;
import com.moon.designpattern.factory.simplefactory.bad.card.IQiYiCardService;
import com.moon.designpattern.factory.simplefactory.bad.coupon.CouponResult;
import com.moon.designpattern.factory.simplefactory.bad.coupon.CouponService;
import com.moon.designpattern.factory.simplefactory.bad.goods.DeliverReq;
import com.moon.designpattern.factory.simplefactory.bad.goods.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Chanmoey
 * @date 2023年03月07日
 */
public class PrizeController {

    private Logger logger = LoggerFactory.getLogger(PrizeController.class);

    public AwardRes awardToUser(AwardReq req) {
        String reqJson = JSON.toJSONString(req);

        AwardRes awardRes = null;

        try {
            logger.info("奖品发放开始{}, req:{}", req.getuId(), reqJson);
            if (req.getAwardType() == 1) {
                CouponService couponService = new CouponService();
                CouponResult couponResult = couponService.sendCoupon(req.getuId(), req.getAwardNumber(), req.getBizId());
                if ("0000".equals(couponResult.getCode())) {
                    awardRes = new AwardRes("0000", "发放成功");
                } else {
                    awardRes = new AwardRes("0001", couponResult.getInfo());
                }
            }else if (req.getAwardType() == 2) {
                GoodsService goodsService = new GoodsService();
                DeliverReq deliverReq = new DeliverReq();
                deliverReq.setUserName(queryUserName(req.getuId()));
                deliverReq.setUserPhone(queryUserPhoneNumber(req.getuId()));
                deliverReq.setSku(req.getAwardNumber());
                deliverReq.setOrderId(req.getBizId());
                deliverReq.setConsigneeUserName(req.getExtMap().get("consigneeUserName"));
                deliverReq.setConsigneeUserPhone(req.getExtMap().get("consigneeUserPhone"));
                deliverReq.setConsigneeUserAddress(req.getExtMap().get("consigneeUserAddress"));
                Boolean isSuccess = goodsService.deliverGoods(deliverReq);
                if (isSuccess) {
                    awardRes = new AwardRes("0000", "发放成功");
                } else {
                    awardRes = new AwardRes("0001", "发放失败");
                }
            }else if (req.getAwardType() == 3) {
                String bindMobileNumber = queryUserPhoneNumber(req.getuId());
                IQiYiCardService iQiYiCardService = new IQiYiCardService();
                iQiYiCardService.grantToken(bindMobileNumber, req.getAwardNumber());
                awardRes = new AwardRes("0000", "发放成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return awardRes;
    }

    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }
}
