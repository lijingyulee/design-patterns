package com.learn.patterns.builder.demo01;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public class HighHouseBuilder extends Builder {
    @Override
    public void buildBase() {
        System.out.println("高楼打地基...");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙...");
    }

    @Override
    public void buildCelling() {
        System.out.println("高楼修天花板...");
    }
}
