package com.learn.patterns.facade.demo01;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public class Demo01Test {
    public static void main(String[] args) {
        new Waiter().serveTea();
        /**
         * 开水已备好
         * 茶具已备好
         * 茶叶已备好
         * 您好客官，茶来了
         */
    }
}
