package com.learn.patterns.adapter.typeclass;

/**
 * @author lijy
 * @date 2019-11-27
 * @description
 */
public class demo01Test {
    public static void main(String[] args) {
        VoltageAdapter voltageAdapter = new VoltageAdapter("220");
        Phone phone = new Phone();
        phone.charging(voltageAdapter);
        /**
         * 调用5V...
         * 调用220V...
         */
    }
}
