package com.learn.patterns.bridge.demo01;

/**
 * @author lijy
 * @date 2019-11-27
 * @description 手动挡
 */
public class Manual extends Transmission {
    @Override
    public String gear() {
        return "手动挡";
    }
}
