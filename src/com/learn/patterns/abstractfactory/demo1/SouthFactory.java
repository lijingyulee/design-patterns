package com.learn.patterns.abstractfactory.demo1;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public class SouthFactory implements FruitFactory {
    @Override
    public SouthApple getApple() {
        return new SouthApple();
    }

    @Override
    public SouthBanana getBanana() {
        return new SouthBanana();
    }
}
