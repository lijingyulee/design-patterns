package com.learn.patterns.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public class CglibProxyFactory implements MethodInterceptor {

    public Object getProxyInstance(Object object) {
        return Enhancer.create(object.getClass(), this);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("动态代理：准备材料");
        methodProxy.invokeSuper(o, objects);
        System.out.println("动态代理:收取反馈");
        return null;
    }
}
