package com.learn.patterns.singleton.type08;

import com.learn.patterns.singleton.type07.Singleton07;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public class Type08Test {
    public static void main(String[] args) {
        Singleton08 instance = Singleton08.INSTANCE;
        Singleton08 instance2 = Singleton08.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

        instance.method();

        /**
         * true
         * instance.hashCode=1689843956
         * instance2.hashCode=1689843956
         * 枚举单例方法
         */
    }
}
