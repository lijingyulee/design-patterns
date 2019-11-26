package com.learn.patterns.singleton.type05;

import com.learn.patterns.singleton.type04.Singleton04;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public class Type05Test {
    public static void main(String[] args) {
        Singleton05 instance = Singleton05.getInstance();
        Singleton05 instance2 = Singleton05.getInstance();
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
