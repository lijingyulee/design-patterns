package com.learn.patterns.singleton.type01;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public class Singleton01 {
    private Singleton01() {}

    private final static Singleton01 instance = new Singleton01();

    public static Singleton01 getInstance() {
        return instance;
    }
}
