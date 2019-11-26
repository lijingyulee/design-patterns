package com.learn.patterns.singleton.type07;

import com.learn.patterns.singleton.type06.Singleton06;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public class Type07Test {
    public static void main(String[] args) {
        Singleton07 instance = Singleton07.getInstance();
        Singleton07 instance2 = Singleton07.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

        /**
         * true
         * instance.hashCode=766572210
         * instance2.hashCode=766572210
         */
    }
}
