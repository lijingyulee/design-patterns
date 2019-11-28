package com.learn.patterns.strategy.demo02;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public class DomesticDuck extends Duck {
    public DomesticDuck() {
        fly = new NoFly();
    }

    @Override
    void info() {
        if (fly != null) {
            fly.fly();
        }
    }
}
