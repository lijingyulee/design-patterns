package com.learn.patterns.prototype.demo02;

import com.learn.patterns.prototype.demo01.Sheep;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public class demo02Test {
    public static void main(String[] args) {
        Monkey tomMonkey = new Monkey("Tom", 18);
        Monkey jamesMonkey = new Monkey("James", 22);
        tomMonkey.setFriend(jamesMonkey);

        try {
            Monkey cloneMonkey = (Monkey) tomMonkey.clone();
            System.out.println(tomMonkey == cloneMonkey);
            System.out.println(tomMonkey.getFriend() == cloneMonkey.getFriend());
            System.out.println(tomMonkey);
            System.out.println(cloneMonkey);
            System.out.println(tomMonkey.getFriend());
            System.out.println(cloneMonkey.getFriend());

            /**
             * false
             * false
             * Monkey{name='Tom', age=18, friend=Monkey{name='James', age=22, friend=null}}
             * Monkey{name='Tom', age=18, friend=Monkey{name='James', age=22, friend=null}}
             * Monkey{name='James', age=22, friend=null}
             * Monkey{name='James', age=22, friend=null}
             */
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
