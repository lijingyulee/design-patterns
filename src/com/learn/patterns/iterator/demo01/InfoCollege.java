package com.learn.patterns.iterator.demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author lijy
 * @date 2019-11-30
 * @description
 */
public class InfoCollege implements ICollege {

    List<Department> departmentList = new ArrayList<>(2);

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name) {
        departmentList.add(new Department(name));
    }

    @Override
    public Iterator createIterator() {
        return new InfoColleageIterator(departmentList);
    }
}
