package com.moon.designpattern.flyweight.good;

import com.moon.designpattern.flyweight.Activity;
import com.moon.designpattern.flyweight.Stock;
import com.moon.designpattern.flyweight.good.util.RedisUtils;

/**
 * @author Chanmoey
 * @date 2023年03月23日
 */
public class ActivityController {

    private RedisUtils redisUtils = new RedisUtils();

    public Activity queryActivityInfo(Long id) {
        Activity activity = ActivityFactory.getActivity(id);
        // 模拟从Redis中获取库存变化信息
        Stock stock = new Stock(1000, redisUtils.getStockUsed());
        activity.setStock(stock);
        return activity;
    }
}
