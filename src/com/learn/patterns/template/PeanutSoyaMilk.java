package com.learn.patterns.template;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public class PeanutSoyaMilk extends SoyaMilkTemplate {
    @Override
    void addCondiments() {
        System.out.println("加入上好的花生");
    }
}
