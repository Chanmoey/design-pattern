package com.moon.designpattern.singleton;

/**
 * 双重锁机制,懒加载，线程安全，锁的粒度小
 *
 * @author Chanmoey
 * @date 2023年03月16日
 */
public class Singleton05 {

    private static volatile Singleton05 instance;

    private Singleton05() {

    }

    public static Singleton05 getInstance() {
        if (null != instance) {
            return instance;
        }

        synchronized (Singleton05.class) {
            if (null == instance) {
                instance = new Singleton05();
            }
        }

        return instance;
    }
}
