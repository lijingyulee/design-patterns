package com.learn.patterns.abstractfactory.demo1;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public interface FruitFactory {
    //实例化Apple
    public Fruit getApple();

    //实例化Banana
    public Fruit getBanana();
}
