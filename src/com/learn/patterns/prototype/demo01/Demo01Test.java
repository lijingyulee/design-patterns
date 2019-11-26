package com.learn.patterns.prototype.demo01;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public class Demo01Test {
    public static void main(String[] args) {
        Sheep tomSheep = new Sheep("Tom", 18);
        Sheep jamesSheep = new Sheep("James", 22);
        tomSheep.setFriend(jamesSheep);

        try {
            Sheep cloneSheep = (Sheep) tomSheep.clone();
            System.out.println(tomSheep == cloneSheep);
            System.out.println(tomSheep.getFriend() == cloneSheep.getFriend());
            /**
             * false
             * true
             */
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
