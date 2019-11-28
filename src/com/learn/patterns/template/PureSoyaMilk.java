package com.learn.patterns.template;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public class PureSoyaMilk extends SoyaMilkTemplate {
    @Override
    void addCondiments() {

    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
