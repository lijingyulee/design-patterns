package com.learn.patterns.mediator.demo01;

/**
 * @author lijy
 * @date 2019-11-30
 * @description
 */
public interface IMediator {
    void register(String name, IColleague colleague);

    void command(String msg, String name);
}
