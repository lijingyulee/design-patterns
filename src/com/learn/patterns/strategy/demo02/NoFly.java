package com.learn.patterns.strategy.demo02;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public class NoFly implements Fly {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
