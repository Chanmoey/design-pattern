package com.moon.designpattern.factory.abstractfactory.good.workshop.impl;

import com.moon.designpattern.factory.abstractfactory.before.redis.cluster.EGM;
import com.moon.designpattern.factory.abstractfactory.good.workshop.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * @author Chanmoey
 * @date 2023年03月08日
 */
public class EGMCacheAdapter implements ICacheAdapter {
    private EGM egm = new EGM();

    public String get(String key) {
        return egm.gain(key);
    }

    public void set(String key, String value) {
        egm.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        egm.delete(key);
    }
}
