package com.moon.designpattern.factory.simplefactory.bad.coupon;

/**
 * @author Chanmoey
 * @date 2023年03月07日
 */
public class CouponService {

    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }

}
