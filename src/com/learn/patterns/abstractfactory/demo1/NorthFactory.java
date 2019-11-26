package com.learn.patterns.abstractfactory.demo1;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public class NorthFactory implements FruitFactory {
    @Override
    public NorthApple getApple() {
        return new NorthApple();
    }

    @Override
    public NorthBanana getBanana() {
        return new NorthBanana();
    }
}
