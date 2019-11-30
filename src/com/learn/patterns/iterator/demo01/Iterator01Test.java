package com.learn.patterns.iterator.demo01;

import java.util.ArrayList;

/**
 * @author lijy
 * @date 2019-11-30
 * @description
 */
public class Iterator01Test {
    public static void main(String[] args) {
        ArrayList<ICollege> colleges = new ArrayList<>(2);

        ComputerCollege computerCollege = new ComputerCollege();
        computerCollege.addDepartment("软件工程");
        computerCollege.addDepartment("大数据");

        InfoCollege infoCollege = new InfoCollege();
        infoCollege.addDepartment("信息安全");
        infoCollege.addDepartment("网络安全");

        colleges.add(computerCollege);
        colleges.add(infoCollege);

        CollegeInfo collegeInfo = new CollegeInfo(colleges);
        collegeInfo.getCollegeInfo();

        /**
         * --- 计算机学院 ---
         * 软件工程
         * 大数据
         * --- 信息工程学院 ---
         * 信息安全
         * 网络安全
         */

    }
}
