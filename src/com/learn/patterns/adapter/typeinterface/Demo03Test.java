package com.learn.patterns.adapter.typeinterface;

/**
 * @author lijy
 * @date 2019-11-27
 * @description
 */
public class Demo03Test {
    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();
        service.test(new AbstractService() {
            @Override
            public void method1() {
                System.out.println("我是重写的method1...");
            }
        });
        /**
         * 我是重写的method1...
         */
    }
}
