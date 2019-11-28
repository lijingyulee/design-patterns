package com.learn.patterns.strategy.demo02;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public class Strategy02Test {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.info();

        System.out.println("---------------------");

        DomesticDuck domesticDuck = new DomesticDuck();
        domesticDuck.info();

        /**
         * 会飞
         * ---------------------
         * 不会飞
         */
    }
}
