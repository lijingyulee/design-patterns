package com.learn.patterns.composite.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public class College extends Organization {

    private List<Organization> organizationList = new ArrayList<>();

    public College(String name) {
        super(name);
    }

    @Override
    protected void add(Organization organization) {
        organizationList.add(organization);
    }

    @Override
    protected void remove(Organization organization) {
        organizationList.remove(organization);
    }

    @Override
    protected void getInfo() {
        System.out.println("  " + this.getName());
        organizationList.forEach(organization -> organization.getInfo());
    }
}
