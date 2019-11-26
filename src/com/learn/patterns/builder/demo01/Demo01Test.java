package com.learn.patterns.builder.demo01;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public class Demo01Test {
    public static void main(String[] args) {
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        Director director = new Director(commonHouseBuilder);
        director.constructHouse();
        System.out.println("=====================================");
        director.setHouseBuilder(new HighHouseBuilder());
        director.constructHouse();

        /**
         * 普通房子打地基...
         * 普通房子砌墙...
         * 普通房子修天花板...
         * =====================================
         * 高楼打地基...
         * 高楼砌墙...
         * 高楼修天花板...
         */

    }
}
