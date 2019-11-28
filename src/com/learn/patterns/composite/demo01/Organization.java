package com.learn.patterns.composite.demo01;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public abstract class Organization {
    private String name;

    public Organization(String name) {
        this.name = name;
    }

    protected void add(Organization organization) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    protected void remove(Organization organization) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    protected abstract void getInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
