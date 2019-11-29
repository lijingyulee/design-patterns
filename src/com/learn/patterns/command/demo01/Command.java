package com.learn.patterns.command.demo01;

/**
 * @author lijy
 * @date 2019-11-29
 * @description
 */
public interface Command {

    /**
     * 执行
     */
    void execute();

    /**
     * 撤销
     */
    public void undo();
}
