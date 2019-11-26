package com.learn.patterns.singleton.type03;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public class Type03Test {
    public static void main(String[] args) {
        Singleton03 instance = Singleton03.getInstance();
        Singleton03 instance2 = Singleton03.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

        /**
         * true
         * instance.hashCode=1689843956
         * instance2.hashCode=1689843956
         */
    }
}
