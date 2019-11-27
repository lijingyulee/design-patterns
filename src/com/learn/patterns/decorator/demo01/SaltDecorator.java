package com.learn.patterns.decorator.demo01;

/**
 * @author lijy
 * @date 2019-11-27
 * @description
 */
public class SaltDecorator extends Decorator {
    public SaltDecorator(Food food) {
        super(food);
    }

    @Override
    void add() {
        super.add();
        System.out.println("面条加盐...");
    }
}
