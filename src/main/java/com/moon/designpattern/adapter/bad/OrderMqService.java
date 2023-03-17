package com.moon.designpattern.adapter.bad;

import com.alibaba.fastjson.JSON;
import com.moon.designpattern.adapter.before.mq.OrderMq;

/**
 * @author Chanmoey
 * @date 2023年03月17日
 */
public class OrderMqService {

    public void onMessage(String message) {

        OrderMq mq = JSON.parseObject(message, OrderMq.class);

        mq.getUid();
        mq.getOrderId();
        mq.getCreateOrderTime();

        // ... 处理自己的业务
    }

}