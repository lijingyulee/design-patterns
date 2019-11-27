package com.learn.patterns.bridge.demo01;

/**
 * @author lijy
 * @date 2019-11-27
 * @description
 */
public abstract class AbstractCar {
    protected Transmission gear;

    public abstract void run();

    public void setTransmission(Transmission gear) {
        this.gear = gear;
    }
}
