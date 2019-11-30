package com.learn.patterns.mediator.demo01;

/**
 * @author lijy
 * @date 2019-11-30
 * @description
 */
public class Mediator01Test {
    public static void main(String[] args) {
        PMMediator pmMediator = new PMMediator();
        ColleagueA colleagueA = new ColleagueA(pmMediator);
        ColleagueB colleagueB = new ColleagueB(pmMediator);
        colleagueA.send("登录页面已完成");
        colleagueB.send("后台接口已完成");

        /**
         * 登录页面已完成
         * 我是后台小龙，我来做登录的后台接口
         * 后台接口已完成
         * 我是前端小明, 我来对接登录接口
         */

    }
}
