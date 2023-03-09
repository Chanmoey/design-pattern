package com.moon.designpattern.builder.good;

import org.junit.Test;

/**
 * @author Chanmoey
 * @date 2023年03月09日
 */
public class ApiTest {

    @Test
    public void test_Builder(){

        Builder builder = new Builder();

        // 豪华欧式
        System.out.println(builder.levelOne(132.52D).getDetail());

        // 轻奢田园
        System.out.println(builder.levelTwo(98.25D).getDetail());

        // 现代简约
        System.out.println(builder.levelThree(85.43D).getDetail());
    }

}
