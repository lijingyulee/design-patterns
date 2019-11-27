package com.learn.patterns.bridge.demo01;

/**
 * @author lijy
 * @date 2019-11-27
 * @description 自动档
 */
public class Auto extends Transmission {
    @Override
    public String gear() {
        return "自动档";
    }
}
