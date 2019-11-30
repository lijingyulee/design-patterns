package com.learn.patterns.mediator.demo01;

/**
 * @author lijy
 * @date 2019-11-30
 * @description
 */
public class ColleagueB implements IColleague {

    private IMediator mediator;

    public ColleagueB(IMediator mediator) {
        this.mediator = mediator;
        mediator.register("B", this);
    }

    @Override
    public void job() {
        System.out.println("我是后台小龙，我来做登录的后台接口");
    }

    @Override
    public void send(String msg) {
        mediator.command(msg, "A");
    }
}
