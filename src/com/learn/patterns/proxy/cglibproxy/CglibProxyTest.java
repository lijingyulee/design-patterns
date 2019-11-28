package com.learn.patterns.proxy.cglibproxy;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        Teacher proxyInstance = (Teacher) new CglibProxyFactory().getProxyInstance(new Teacher());
        proxyInstance.teach();
        /**
         * 动态代理：准备材料
         * 老师传播知识
         * 动态代理:收取反馈
         */
    }
}
