package com.moon.designpattern.factory.simplefactory.good;

import com.moon.designpattern.factory.simplefactory.good.store.ICommodity;
import com.moon.designpattern.factory.simplefactory.good.store.impl.CardCommodityService;
import com.moon.designpattern.factory.simplefactory.good.store.impl.CouponCommodityService;
import com.moon.designpattern.factory.simplefactory.good.store.impl.GoodsCommodityService;

/**
 * @author Chanmoey
 * @date 2023年03月07日
 */
public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}
