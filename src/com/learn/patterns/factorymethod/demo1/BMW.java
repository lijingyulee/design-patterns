package com.learn.patterns.factorymethod.demo1;

/**
 * @author lijy
 * @date 2019-11-25
 * @description
 */
public class BMW implements ICar {
    @Override
    public void run() {
        System.out.println("宝马在飞速行驶中...");
    }
}
