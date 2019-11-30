package com.learn.patterns.iterator.demo01;

import java.util.Iterator;
import java.util.List;

/**
 * @author lijy
 * @date 2019-11-30
 * @description
 */
public class CollegeInfo {
    private List<ICollege> collegeList;

    public CollegeInfo(List<ICollege> collegeList) {
        this.collegeList = collegeList;
    }

    public void getCollegeInfo() {
        Iterator<ICollege> iterator = collegeList.iterator();
        ICollege college;
        while (iterator.hasNext()) {
            college = iterator.next();
            System.out.println("--- " + college.getName() + " ---");
            // 打印学院下面的department
            getDepartInfo(college.createIterator());
        }
    }

    private void getDepartInfo(Iterator iterator) {
        Department department;
        while (iterator.hasNext()) {
            department = (Department) iterator.next();
            System.out.println(department.getName());;
        }
    }

}
