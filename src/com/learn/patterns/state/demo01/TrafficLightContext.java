package com.learn.patterns.state.demo01;

/**
 * @author lijy
 * @date 2019-12-05
 * @description
 */
public class TrafficLightContext {
    private IState state;

    public void setState(IState state) {
        this.state = state;
    }

    public void handle() {
        this.state.handle();
    }
}
