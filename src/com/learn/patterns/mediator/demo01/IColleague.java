package com.learn.patterns.mediator.demo01;

/**
 * @author lijy
 * @date 2019-11-30
 * @description
 */
public interface IColleague {
    /**
     * 本职工作
     */
    void job();

    /**
     * 向中介者发信息
     */
    void send(String msg);
}
