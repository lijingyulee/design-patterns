package com.learn.patterns.state.demo01;

/**
 * @author lijy
 * @date 2019-12-05
 * @description
 */
public class RedState implements IState {
    @Override
    public void handle() {
        System.out.println("红灯状态...");
    }
}
