package com.moon.designpattern.adapter.good.impl;

import com.moon.designpattern.adapter.before.service.POPOrderService;
import com.moon.designpattern.adapter.good.OrderAdapterService;

/**
 * @author Chanmoey
 * @date 2023年03月17日
 */
public class POPOrderAdapterServiceImpl implements OrderAdapterService {

    private POPOrderService popOrderService = new POPOrderService();

    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }

}
