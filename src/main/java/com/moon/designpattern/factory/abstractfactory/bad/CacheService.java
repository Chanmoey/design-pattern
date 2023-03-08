package com.moon.designpattern.factory.abstractfactory.bad;

import java.util.concurrent.TimeUnit;

/**
 * @author Chanmoey
 * @date 2023年03月08日
 */
public interface CacheService {

    String get(final String key, int redisType);

    void set(String key, String value, int redisType);

    void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType);

    void del(String key, int redisType);

}
