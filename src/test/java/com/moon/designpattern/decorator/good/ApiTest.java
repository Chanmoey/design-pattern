package com.moon.designpattern.decorator.good;

import com.moon.designpattern.decorator.before.SsoInterceptor;
import org.junit.Test;

/**
 * @author Chanmoey
 * @date 2023年03月21日
 */
public class ApiTest {

    @Test
    public void test_LoginSsoDecorator() {
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator(new SsoInterceptor());
        String request = "1successhuahua";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu", "t");
        System.out.println("登录校验：" + request + (success ? " 放行" : " 拦截"));
    }

}
