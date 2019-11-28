package com.learn.patterns.composite.demo01;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public class Department extends Organization {

    public Department(String name) {
        super(name);
    }

    @Override
    protected void getInfo() {
        System.out.println("    " + this.getName());
    }
}
