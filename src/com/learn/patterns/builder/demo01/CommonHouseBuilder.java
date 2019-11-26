package com.learn.patterns.builder.demo01;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public class CommonHouseBuilder extends Builder {
    @Override
    public void buildBase() {
        System.out.println("普通房子打地基...");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙...");
    }

    @Override
    public void buildCelling() {
        System.out.println("普通房子修天花板...");
    }
}
