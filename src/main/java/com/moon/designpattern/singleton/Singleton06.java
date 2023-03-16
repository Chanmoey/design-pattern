package com.moon.designpattern.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * CAS
 *
 * @author Chanmoey
 * @date 2023年03月16日
 */
public class Singleton06 {

    private static final AtomicReference<Singleton06> INSTANCE = new AtomicReference<>();

    private Singleton06() {

    }

    public static Singleton06 getInstance() {
        for (;;) {
            Singleton06 instance = INSTANCE.get();
            if (null != instance) {
                return instance;
            }
            instance = new Singleton06();
            if (INSTANCE.compareAndSet(null, instance)) {
                return instance;
            }
        }
    }
}
