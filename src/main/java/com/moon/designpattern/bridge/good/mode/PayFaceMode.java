package com.moon.designpattern.bridge.good.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Chanmoey
 * @date 2023年03月17日
 */
public class PayFaceMode implements IPayMode{

    protected Logger logger = LoggerFactory.getLogger(PayFaceMode.class);

    public boolean security(String uId) {
        logger.info("人脸支付，风控校验脸部识别");
        return true;
    }

}

