package com.learn.patterns.iterator.demo01;

import java.util.Iterator;

/**
 * @author lijy
 * @date 2019-11-30
 * @description
 */
public class ComputerCollegeIterator implements Iterator {

    Department[] departments;
    int index = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.length || departments[index] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return departments[index++];
    }
}
