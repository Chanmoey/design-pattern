package com.moon.designpattern.bridge.good.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Chanmoey
 * @date 2023年03月17日
 */
public class PayFingerprintMode implements IPayMode{

    protected Logger logger = LoggerFactory.getLogger(PayFingerprintMode.class);

    public boolean security(String uId) {
        logger.info("指纹支付，风控校验指纹信息");
        return true;
    }

}

