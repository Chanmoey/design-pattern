package com.moon.designpattern.factory.abstractfactory.good.factory;

import com.moon.designpattern.factory.abstractfactory.good.util.ClassLoaderUtils;
import com.moon.designpattern.factory.abstractfactory.good.workshop.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Chanmoey
 * @date 2023年03月08日
 */
public class JDKInvocationHandler implements InvocationHandler {

    private ICacheAdapter cacheAdapter;

    public JDKInvocationHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args))
                .invoke(cacheAdapter, args);
    }
}
