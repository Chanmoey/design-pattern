package com.moon.designpattern.bridge.good;

import com.moon.designpattern.bridge.good.channel.Pay;
import com.moon.designpattern.bridge.good.channel.WxPay;
import com.moon.designpattern.bridge.good.channel.ZfbPay;
import com.moon.designpattern.bridge.good.mode.PayFaceMode;
import com.moon.designpattern.bridge.good.mode.PayFingerprintMode;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author Chanmoey
 * @date 2023年03月17日
 */
public class ApiTest {

    @Test
    public void test_pay() {
        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111", "100000109893", new BigDecimal(100));

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("jlu19dlxo111","100000109894",new BigDecimal(100));
    }

}
