package com.learn.patterns.prototype.demo03;

/**
 * @author lijy
 * @date 2019-11-26
 * @description
 */
public class Demo03Test {
    public static void main(String[] args) {
        Monkey tomMonkey = new Monkey("Tom", 18);
        Monkey jamesMonkey = new Monkey("Jack", 22);
        tomMonkey.setFriend(jamesMonkey);

        Monkey cloneMonkey = (Monkey) tomMonkey.deepClone();
        System.out.println(tomMonkey == cloneMonkey);
        System.out.println(tomMonkey.getFriend() == cloneMonkey.getFriend());
        System.out.println(tomMonkey);
        System.out.println(cloneMonkey);
        System.out.println(tomMonkey.getFriend());
        System.out.println(cloneMonkey.getFriend());

        /**
         * false
         * false
         * Monkey{name='Tom', age=18, friend=Monkey{name='Jack', age=22, friend=null}}
         * Monkey{name='Tom', age=18, friend=Monkey{name='Jack', age=22, friend=null}}
         * Monkey{name='Jack', age=22, friend=null}
         * Monkey{name='Jack', age=22, friend=null}
         */

    }
}
