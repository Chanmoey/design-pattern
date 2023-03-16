package com.moon.designpattern.singleton;

/**
 * 线程安全、自由串行化、单一实例
 * <p>
 * 存在继承场景下是不可用的，但可以用组合呀。
 *
 * @author Chanmoey
 * @date 2023年03月16日
 */
public enum Singleton07 {

    INSTANCE;

    public void test() {
        System.out.println("我是单例哈哈哈");
    }
}
