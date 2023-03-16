package com.moon.designpattern.singleton;

/**
 * 懒汉，非线程安全
 *
 * @author Chanmoey
 * @date 2023年03月16日
 */
public class Singleton01 {

    private static Singleton01 instance;

    private Singleton01() {

    }

    public static Singleton01 getInstance() {
        if (null != instance) {
            return instance;
        }
        instance = new Singleton01();
        return instance;
    }
}
