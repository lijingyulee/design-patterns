package com.learn.patterns.builder.demo01;

/**
 * @author lijy
 * @date 2019-11-26
 * @description 指挥者
 */
public class Director {
    private Builder build = null;

    //构造器传入
    public Director(Builder build) {
        this.build = build;
    }

    //通过setter传入
    public void setHouseBuilder(Builder build) {
        this.build = build;
    }

    //如何处理建造房子的流程，交给指挥者
    public House constructHouse() {
        build.buildBase();
        build.buildWalls();
        build.buildCelling();
        return build.buildHouse();
    }
}
