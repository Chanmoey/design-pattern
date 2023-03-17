package com.moon.designpattern.adapter.bad;

import com.alibaba.fastjson.JSON;
import com.moon.designpattern.adapter.before.mq.POPOrderDelivered;

/**
 * @author Chanmoey
 * @date 2023年03月17日
 */
public class POPOrderDeliveredService {

    public void onMessage(String message) {

        POPOrderDelivered mq = JSON.parseObject(message, POPOrderDelivered.class);

        mq.getuId();
        mq.getOrderId();
        mq.getOrderTime();

        // ... 处理自己的业务
    }

}
