package com.learn.patterns.state.demo01;

/**
 * @author lijy
 * @date 2019-12-05
 * @description
 */
public class Yellow implements IState {
    @Override
    public void handle() {
        System.out.println("黄灯状态...");
    }
}
