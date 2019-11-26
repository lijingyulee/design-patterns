package com.learn.patterns.singleton.type02;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public class Singleton02 {
    private Singleton02() {}

    private static Singleton02 instance;
    static {
        instance = new Singleton02();
    }

    public static Singleton02 getInstance() {
        return instance;
    }
}
