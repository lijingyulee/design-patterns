package com.learn.patterns.simplefactory.demo1;

/**
 * @author lijy
 * @date 2019-11-09
 * @description 宝马汽车
 */
public class BMW extends AbstractCar {

    @Override
    public void run() {
        System.out.println("宝马汽车飞速行驶中...");
    }
}
