package com.moon.designpattern.decorator.before;

/**
 * @author Chanmoey
 * @date 2023年03月21日
 */
public interface HandlerInterceptor {

    boolean preHandle(String request, String response, Object handler);
}
