package com.learn.patterns.bridge.demo01;

/**
 * @author lijy
 * @date 2019-11-27
 * @description
 */
public class Demo01Test {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        Auto auto = new Auto();
        bmw.setTransmission(auto);
        bmw.run();

        Manual manual = new Manual();
        bmw.setTransmission(manual);
        bmw.run();

        /**
         * 自动档宝马
         * 手动挡宝马
         */
    }
}
