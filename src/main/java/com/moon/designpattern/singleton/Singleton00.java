package com.moon.designpattern.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 静态属性饿汉
 * 线程不安全
 *
 * @author Chanmoey
 * @date 2023年03月16日
 */
public class Singleton00 {

    public static Map<String, String> cache = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        System.out.println(System.identityHashCode(Singleton00.cache));
        Singleton00.cache = new ConcurrentHashMap<>();
        System.out.println(System.identityHashCode(Singleton00.cache));
        System.out.println();
    }
}
