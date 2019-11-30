package com.learn.patterns.iterator.demo01;

import java.util.Iterator;

/**
 * @author lijy
 * @date 2019-11-30
 * @description
 */
public class ComputerCollege implements ICollege {

    Department[] departments = new Department[2];
    int totalOfDepartment = 0 ;

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name) {
        Department department = new Department(name);
        departments[totalOfDepartment++] = department;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
