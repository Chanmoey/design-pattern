package com.moon.designpattern.factory.simplefactory.bad.goods;

import com.alibaba.fastjson.JSON;

/**
 * @author Chanmoey
 * @date 2023年03月07日
 */
public class GoodsService {

    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }

}