package com.learn.patterns.proxy.dynamicproxy;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        ProxyFactory proxyFactory = new ProxyFactory(teacher);
        Iteach proxyInstance = (Iteach) proxyFactory.getProxyInstance();
        proxyInstance.teach();
        /**
         * 动态代理：准备材料
         * 老师传播知识
         * 动态代理:收取反馈
         */
    }
}
