package com.moon.designpattern.decorator.bad;

import com.moon.designpattern.decorator.before.SsoInterceptor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Chanmoey
 * @date 2023年03月21日
 */
public class LoginSsoDecorator extends SsoInterceptor {

    private static Map<String, String> authMap = new ConcurrentHashMap<>();

    static {
        authMap.put("huahua", "queryUserInfo");
        authMap.put("doudou", "queryUserInfo");
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        String ticket = request.substring(1, 8);
        boolean success = ticket.equals("success");
        if (!success) return false;

        String userId = request.substring(9);
        String method = authMap.get(userId);

        // 模拟方法校验
        return "queryUserInfo".equals(method);
    }
}
