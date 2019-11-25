package com.learn.patterns.factorymethod.demo1;

/**
 * @author lijy
 * @date 2019-11-25
 * @description
 */
public class Demo1Test {
    public static void main(String[] args) {
        AudiFactory audiFactory = new AudiFactory();
        ICar audi = audiFactory.createCar();
        audi.run();

        BMWFactory bmwFactory = new BMWFactory();
        ICar bmw = bmwFactory.createCar();
        bmw.run();

        /**
         * 奥迪汽车在飞速行驶中...
         * 宝马在飞速行驶中...
         */
    }
}
