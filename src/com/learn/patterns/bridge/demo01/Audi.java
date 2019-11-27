package com.learn.patterns.bridge.demo01;

/**
 * @author lijy
 * @date 2019-11-27
 * @description
 */
public class Audi extends AbstractCar{
    @Override
    public void run() {
        String gear = super.gear.gear();
        System.out.println(gear + "奥迪");
    }
}
