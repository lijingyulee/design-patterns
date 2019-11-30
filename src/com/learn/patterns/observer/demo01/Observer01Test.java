package com.learn.patterns.observer.demo01;

/**
 * @author lijy
 * @date 2019-11-30
 * @description
 */
public class Observer01Test {
    public static void main(String[] args) {
        XiaoMing xiaoMing = new XiaoMing();
        XiaoLong xiaoLong = new XiaoLong();

        WechatServer wechatServer = new WechatServer();
        wechatServer.registerObserver(xiaoMing);
        wechatServer.registerObserver(xiaoLong);
        wechatServer.publish("北京初雪20191129");

        wechatServer.removeObserver(xiaoMing);
        wechatServer.publish("忽如一夜春风来，千树万树梨花开");

        /**
         * 公众号发布了《北京初雪20191129》
         * 小明收到了公众号发布的文章《北京初雪20191129》
         * 小龙收到了公众号发布的文章《北京初雪20191129》
         * 公众号发布了《忽如一夜春风来，千树万树梨花开》
         * 小龙收到了公众号发布的文章《忽如一夜春风来，千树万树梨花开》
         */

    }
}
