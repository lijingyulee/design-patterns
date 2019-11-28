package com.learn.patterns.proxy.dynamicproxy;

/**
 * @author lijy
 * @date 2019-11-28
 * @description 教师
 */
public class Teacher implements Iteach {
    @Override
    public void teach() {
        System.out.println("老师传播知识");
    }
}
