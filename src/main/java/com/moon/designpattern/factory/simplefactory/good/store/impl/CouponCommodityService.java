package com.moon.designpattern.factory.simplefactory.good.store.impl;

import com.alibaba.fastjson.JSON;
import com.moon.designpattern.factory.simplefactory.bad.coupon.CouponResult;
import com.moon.designpattern.factory.simplefactory.bad.coupon.CouponService;
import com.moon.designpattern.factory.simplefactory.good.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author Chanmoey
 * @date 2023年03月07日
 */
public class CouponCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

    private CouponService couponService = new CouponService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {

        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", JSON.toJSON(couponResult));
        if (!"0000".equals(couponResult.getCode())) throw new RuntimeException(couponResult.getInfo());

    }
}
