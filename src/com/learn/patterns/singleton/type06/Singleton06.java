package com.learn.patterns.singleton.type06;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public class Singleton06 {
    private Singleton06() {}

    private volatile static Singleton06 instance;

    public static Singleton06 getInstance() {
        if (instance == null) {
            synchronized (Singleton06.class) {
                if(instance == null) {
                    instance = new Singleton06();
                }
            }
        }
        return instance;
    }
}
