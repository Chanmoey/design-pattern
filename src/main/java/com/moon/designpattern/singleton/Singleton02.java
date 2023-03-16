package com.moon.designpattern.singleton;

/**
 * 懒汉，线程安全但性能差
 *
 * @author Chanmoey
 * @date 2023年03月16日
 */
public class Singleton02 {

    private static Singleton02 instance;

    private Singleton02() {

    }

    public static synchronized Singleton02 getInstance() {
        if (null != instance) {
            return instance;
        }

        instance = new Singleton02();
        return instance;
    }
}
