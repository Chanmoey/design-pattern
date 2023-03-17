package com.moon.designpattern.adapter.good.impl;

import com.moon.designpattern.adapter.before.service.OrderService;
import com.moon.designpattern.adapter.good.OrderAdapterService;

/**
 * @author Chanmoey
 * @date 2023年03月17日
 */
public class InsideOrderServiceImpl implements OrderAdapterService {

    private OrderService orderService = new OrderService();

    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }

}
