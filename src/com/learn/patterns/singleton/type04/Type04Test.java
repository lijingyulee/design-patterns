package com.learn.patterns.singleton.type04;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public class Type04Test {
    public static void main(String[] args) {
        Singleton04 instance = Singleton04.getInstance();
        Singleton04 instance2 = Singleton04.getInstance();
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
