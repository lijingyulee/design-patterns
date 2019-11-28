package com.learn.patterns.proxy.staticproxy;

/**
 * @author lijy
 * @date 2019-11-28
 * @description
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        AssistantProxy assistantProxy = new AssistantProxy(new Teacher());
        assistantProxy.teach();
        /**
         * 助教准备上课材料
         * 老师传播知识
         * 助教收取反馈
         */
    }
}
