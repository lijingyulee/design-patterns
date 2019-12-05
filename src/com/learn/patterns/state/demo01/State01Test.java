package com.learn.patterns.state.demo01;

/**
 * @author lijy
 * @date 2019-12-05
 * @description
 */
public class State01Test {
    public static void main(String[] args) {
        TrafficLightContext trafficLightContext = new TrafficLightContext();
        trafficLightContext.setState(new RedState());
        trafficLightContext.handle();

        trafficLightContext.setState(new GreenState());
        trafficLightContext.handle();

        /**
         * 红灯状态...
         * 绿灯状态...
         */
    }
}
