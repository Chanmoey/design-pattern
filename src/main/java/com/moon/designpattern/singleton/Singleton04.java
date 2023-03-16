package com.moon.designpattern.singleton;

/**
 * 使用内部类，线程安全，饿汉懒加载，不加锁，推荐使用。
 * <p>
 * 外部类加载时并不需要立即加载内部类，内部类不被加载则不去初始化INSTANCE，故而不占内存
 *
 * @author Chanmoey
 * @date 2023年03月16日
 */
public class Singleton04 {

    private static class SingletonHolder {
        private static Singleton04 instance = new Singleton04();
    }

    private Singleton04() {

    }

    public static Singleton04 getInstance() {
        return SingletonHolder.instance;
    }
}
