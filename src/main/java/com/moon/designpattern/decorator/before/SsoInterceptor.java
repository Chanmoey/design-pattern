package com.moon.designpattern.decorator.before;

/**
 * @author Chanmoey
 * @date 2023年03月21日
 */
public class SsoInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        String ticket = request.substring(1, 8);
        return ticket.equals("success");
    }

}
