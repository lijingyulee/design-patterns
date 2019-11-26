package com.learn.patterns.builder.demo01;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public abstract class Builder {
    protected House house = new House();

    //将建造的流程写好, 抽象的方法
    public abstract void buildBase();
    public abstract void buildWalls();
    public abstract void buildCelling();

    //建造房子好， 将产品(房子) 返回
    public House buildHouse() {
        return house;
    }
}
