package com.moon.designpattern.factory.abstractfactory.good;


import com.moon.designpattern.factory.abstractfactory.good.factory.JDKProxyFactory;
import com.moon.designpattern.factory.abstractfactory.good.workshop.ICacheAdapter;
import com.moon.designpattern.factory.abstractfactory.good.workshop.impl.EGMCacheAdapter;
import com.moon.designpattern.factory.abstractfactory.good.workshop.impl.IIRCacheAdapter;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Chanmoey
 * @date 2023年03月08日
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_CacheService() throws Exception {
        ICacheAdapter proxy_EGM = JDKProxyFactory.getProxy(ICacheAdapter.class, EGMCacheAdapter.class);
        proxy_EGM.set("user_name_01", "小傅哥");
        String val01 = proxy_EGM.get("user_name_01");
        logger.info("缓存服务 EGM 测试，proxy_EGM.get 测试结果：{}", val01);

        ICacheAdapter proxy_IIR = JDKProxyFactory.getProxy(ICacheAdapter.class, IIRCacheAdapter.class);
        proxy_IIR.set("user_name_01", "小傅哥");
        String val02 = proxy_IIR.get("user_name_01");
        logger.info("缓存服务 IIR 测试，proxy_IIR.get 测试结果：{}", val02);
    }

}
