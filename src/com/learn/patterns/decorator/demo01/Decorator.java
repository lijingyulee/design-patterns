package com.learn.patterns.decorator.demo01;

/**
 * @author lijy
 * @date 2019-11-27
 * @description
 */
public class Decorator extends Food {

    private Food food;

    public Decorator(Food food) {
        this.food = food;
    }

    @Override
    void add() {
        food.add();
    }
}
