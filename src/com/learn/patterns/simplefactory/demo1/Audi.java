package com.learn.patterns.simplefactory.demo1;

/**
 * @author lijy
 * @date 2019-11-09
 * @description 奥迪汽车
 */
public class Audi extends AbstractCar {
    @Override
    public void run() {
        System.out.println("奥迪汽车飞速行驶中...");
    }
}
