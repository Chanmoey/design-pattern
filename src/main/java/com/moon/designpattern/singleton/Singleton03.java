package com.moon.designpattern.singleton;

/**
 * 饿汉式，线程安全
 *
 * @author Chanmoey
 * @date 2023年03月16日
 */
public class Singleton03 {

    private static Singleton03 instance = new Singleton03();

    private Singleton03(){}

    public static Singleton03 getInstance() {
        return instance;
    }
}
