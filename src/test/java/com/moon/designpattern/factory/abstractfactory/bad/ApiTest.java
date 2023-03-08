package com.moon.designpattern.factory.abstractfactory.bad;

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
    public void test_CacheServiceAfterImpl() {
        CacheService cacheService = new CacheClusterServiceImpl();

        cacheService.set("user_name_01", "小傅哥", 1);
        String val01 = cacheService.get("user_name_01", 1);
        logger.info("缓存集群升级，测试结果：{}", val01);
    }

}
