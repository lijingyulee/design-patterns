package com.learn.patterns.state.demo01;

/**
 * @author lijy
 * @date 2019-12-05
 * @description
 */
public class GreenState implements IState {
    @Override
    public void handle() {
        System.out.println("绿灯状态...");
    }
}
