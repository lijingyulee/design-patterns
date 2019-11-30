package com.learn.patterns.iterator.demo01;

import java.util.Iterator;
import java.util.List;

/**
 * @author lijy
 * @date 2019-11-30
 * @description
 */
public class InfoColleageIterator implements Iterator {

    private List<Department> departmentList;
    int index = -1;

    public InfoColleageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if(index++ >= departmentList.size() - 1) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }
}
