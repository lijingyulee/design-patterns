package com.learn.patterns.command.demo01;

/**
 * @author lijy
 * @date 2019-11-29
 * @description 空命令，不执行任何操作，可以省去为空判断
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
