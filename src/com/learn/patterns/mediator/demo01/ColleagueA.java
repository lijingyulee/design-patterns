package com.learn.patterns.mediator.demo01;

/**
 * @author lijy
 * @date 2019-11-30
 * @description
 */
public class ColleagueA implements IColleague {

    private IMediator mediator;

    public ColleagueA(IMediator mediator) {
        this.mediator = mediator;
        mediator.register("A", this);
    }

    @Override
    public void job() {
        System.out.println("我是前端小明, 我来对接登录接口");
    }

    @Override
    public void send(String msg) {
        mediator.command(msg, "B");
    }
}
