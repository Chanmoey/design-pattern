package com.moon.designpattern.decorator.good;

import com.moon.designpattern.decorator.before.HandlerInterceptor;

/**
 * @author Chanmoey
 * @date 2023年03月21日
 */
public class SsoDecorator implements HandlerInterceptor {

    private HandlerInterceptor handlerInterceptor;

    private SsoDecorator() {

    }

    public SsoDecorator(HandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        return handlerInterceptor.preHandle(request, response, handler);
    }
}
