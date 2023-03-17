package com.moon.designpattern.adapter.bad;

import com.alibaba.fastjson.JSON;
import com.moon.designpattern.adapter.before.mq.CreateCount;

/**
 * @author Chanmoey
 * @date 2023年03月17日
 */
public class CreateAccountMqService {

    public void onMessage(String message) {

        CreateCount mq = JSON.parseObject(message, CreateCount.class);

        mq.getNumber();
        mq.getAccountDate();

        // ... 处理自己的业务
    }
}
