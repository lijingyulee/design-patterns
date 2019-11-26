package com.learn.patterns.singleton.type03;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public class Singleton03 {
    private Singleton03() {}

    private static Singleton03 instance;

    public static Singleton03 getInstance() {
        if (instance == null) {
            instance = new Singleton03();
        }
        return instance;
    }

    /**
     * true
     * instance.hashCode=1689843956
     * instance2.hashCode=1689843956
     */
}
