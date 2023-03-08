package com.moon.designpattern.factory.abstractfactory.good.workshop.impl;

import com.moon.designpattern.factory.abstractfactory.before.redis.cluster.IIR;
import com.moon.designpattern.factory.abstractfactory.good.workshop.ICacheAdapter;

import java.util.concurrent.TimeUnit;

/**
 * @author Chanmoey
 * @date 2023年03月08日
 */
public class IIRCacheAdapter implements ICacheAdapter {

    private IIR iir = new IIR();

    @Override
    public String get(String key) {
        return iir.get(key);
    }

    @Override
    public void set(String key, String value) {
        iir.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        iir.del(key);
    }

}
