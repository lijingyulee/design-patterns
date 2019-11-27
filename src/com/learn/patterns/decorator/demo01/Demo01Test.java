package com.learn.patterns.decorator.demo01;

/**
 * @author lijy
 * @date 2019-11-27
 * @description
 */
public class Demo01Test {
    public static void main(String[] args) {
        Noodle noodle = new Noodle();
        SaltDecorator saltDecorator = new SaltDecorator(noodle);
        VinegarDecorator vinegarDecorator = new VinegarDecorator(saltDecorator);
        vinegarDecorator.add();

        /**
         * 面条加面..
         * 面条加盐...
         * 面条加醋...
         */
    }
}
