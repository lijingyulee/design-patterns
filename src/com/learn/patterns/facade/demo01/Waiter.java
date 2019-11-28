package com.learn.patterns.facade.demo01;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public class Waiter {
    public void serveTea() {
        new Water().getWater();
        new Cup().getCup();
        new Tea().getTea();
        System.out.println("您好客官，茶来了");
    }
}
