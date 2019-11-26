package com.learn.patterns.builder.demo01;

/**
 * @author lijy
 * @date 2019-11-26
 * @description 产品（Product）
 */
public class House {
    private String base;
    private String wall;
    private String ceiling;
    public String getBase() {
        return base;
    }
    public void setBase(String base) {
        this.base = base;
    }
    public String getWall() {
        return wall;
    }
    public void setWall(String wall) {
        this.wall = wall;
    }
    public String getCeiling() {
        return ceiling;
    }
    public void setCeiling(String ceiling) {
        this.ceiling = ceiling;
    }
}
