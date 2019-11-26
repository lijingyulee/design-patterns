package com.learn.patterns.singleton.type04;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public class Singleton04 {
    private Singleton04() {}

    private static Singleton04 instance;

    public static synchronized Singleton04 getInstance() {
        if (instance == null) {
            instance = new Singleton04();
        }
        return instance;

    }
}
