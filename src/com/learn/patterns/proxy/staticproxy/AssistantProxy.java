package com.learn.patterns.proxy.staticproxy;

/**
 * @author lijy
 * @date 2019-11-28
 * @description 助教
 */
public class AssistantProxy implements Iteach{

    private Iteach target;

    public AssistantProxy(Iteach target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("助教准备上课材料");
        target.teach();
        System.out.println("助教收取反馈");
    }
}
