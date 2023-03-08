package com.moon.designpattern.factory.abstractfactory.good.factory;

import com.moon.designpattern.factory.abstractfactory.good.workshop.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 代理工厂
 * @author Chanmoey
 * @date 2023年03月08日
 */
public class JDKProxyFactory {

    public static <T> T getProxy(Class<T> cacheClass, Class<? extends ICacheAdapter> cacheAdapter) throws InstantiationException, IllegalAccessException {
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter.newInstance());
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{cacheClass}, handler);
    }
}
