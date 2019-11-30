package com.learn.patterns.iterator.demo01;

import java.util.Iterator;

/**
 * @author lijy
 * @date 2019-11-30
 * @description
 */
public interface ICollege {

    String getName();

    void addDepartment(String name);

    Iterator createIterator();
}
