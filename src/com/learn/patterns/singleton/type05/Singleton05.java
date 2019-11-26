package com.learn.patterns.singleton.type05;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public class Singleton05 {
    private Singleton05() {}

    private static Singleton05 instance;

    public static Singleton05 getInstance() {
        if (instance == null) {
            synchronized (Singleton05.class) {
                instance = new Singleton05();
            }
        }
        return instance;
    }
}
