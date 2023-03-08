package com.moon.designpattern.factory.abstractfactory.before.application;

import java.util.concurrent.TimeUnit;

/**
 * @author Chanmoey
 * @date 2023年03月08日
 */
public interface CacheService {

    String get(final String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);

}
