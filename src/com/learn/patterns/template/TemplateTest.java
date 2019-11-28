package com.learn.patterns.template;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public class TemplateTest {
    public static void main(String[] args) {
        PureSoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
        System.out.println("-------------------");
        PeanutSoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
        /**
         * 选择好的新鲜黄豆
         * 材料开始浸泡
         * 材料放到豆浆机去打碎
         * -------------------
         * 选择好的新鲜黄豆
         * 加入上好的花生
         * 材料开始浸泡
         * 材料放到豆浆机去打碎
         */
    }
}
