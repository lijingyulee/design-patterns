package com.learn.patterns.singleton.type07;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public class Singleton07 {
    private Singleton07() {}

    private static class InnerClass {
        private static final Singleton07 INSTANCE = new Singleton07();
    }

    public static Singleton07 getInstance() {
        return InnerClass.INSTANCE;
    }

}
