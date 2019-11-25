package com.learn.patterns.factorymethod.demo1;

/**
 * @author lijy
 * @date 2019-11-25
 * @description
 */
public class Audi implements ICar {
    @Override
    public void run() {
        System.out.println("奥迪汽车在飞速行驶中...");
    }
}
