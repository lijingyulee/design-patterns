package com.learn.patterns.simplefactory.demo1;

/**
 * @author lijy
 * @date 2019-11-09
 * @description demo1测试类
 */
public class Demo1Test {
    public static void main(String[] args) {

        // 得到具体的汽车--宝马
        AbstractCar bwm = CarFactory.getCar("bwm");
        bwm.run();

        // 得到具体的汽车--奥迪
        AbstractCar audi = CarFactory.getCar("audi");
        audi.run();

        /*
            执行结果：
                宝马汽车飞速行驶中...
                奥迪汽车飞速行驶中...
         */

    }
}
