package com.learn.patterns.strategy.demo02;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public class WildDuck extends Duck {
    public WildDuck() {
        fly = new CanFly();
    }

    @Override
    void info() {
        if (fly != null) {
            fly.fly();
        }
    }
}
