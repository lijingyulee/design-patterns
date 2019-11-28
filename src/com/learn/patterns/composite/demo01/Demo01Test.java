package com.learn.patterns.composite.demo01;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public class Demo01Test {
    public static void main(String[] args) {
        // 大学
        University university = new University("清华大学");

        // 计算机系
        College computerCollege = new College("计算机系");
        computerCollege.add(new Department("软件工程"));
        computerCollege.add(new Department("安全工程"));

        // 信息工程
        College infoEngineercollege = new College("信息工程学院");
        infoEngineercollege.add(new Department("信息工程"));
        infoEngineercollege.add(new Department("通信工程"));

        university.add(computerCollege);
        university.add(infoEngineercollege);

        university.getInfo();
        System.out.println("---------------------");

        infoEngineercollege.getInfo();

        /**
         * 清华大学
         *   计算机系
         *     软件工程
         *     安全工程
         *   信息工程学院
         *     信息工程
         *     通信工程
         * ---------------------
         *   信息工程学院
         *     信息工程
         *     通信工程
         */
    }
}
