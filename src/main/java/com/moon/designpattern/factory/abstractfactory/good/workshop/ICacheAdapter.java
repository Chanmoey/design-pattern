package com.moon.designpattern.factory.abstractfactory.good.workshop;

import java.util.concurrent.TimeUnit;

/**
 * 装饰器，集群提供者实现这个接口
 *
 * @author Chanmoey
 * @date 2023年03月08日
 */
public interface ICacheAdapter {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
