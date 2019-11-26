package com.learn.patterns.abstractfactory.demo1;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public class Demo1Test {
    public static void main(String[] args) {
        SouthFactory southFactory = new SouthFactory();
        Fruit southApple = southFactory.getApple();
        southApple.show();
        Fruit southBanana = southFactory.getBanana();
        southBanana.show();

        NorthFactory northFactory = new NorthFactory();
        Fruit northApple = northFactory.getApple();
        northApple.show();
        Fruit northBanana = northFactory.getBanana();
        northBanana.show();

        /**
         * 南方的苹果...
         * 南方的香蕉...
         * 北方的苹果...
         * 北方的香蕉...
         */

    }
}
