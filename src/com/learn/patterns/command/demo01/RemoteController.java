package com.learn.patterns.command.demo01;

/**
 * @author lijy
 * @date 2019-11-29
 * @description
 */
public class RemoteController {
    // 打开功能按钮
    Command[] onCommands;
    // 关闭功能按钮
    Command[] offCommands;
    // 执行撤销的命令
    Command undoCommand;

    public RemoteController() {

        onCommands = new Command[2];
        offCommands = new Command[2];

        for (int i = 0; i < 2; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int index, Command onCommand, Command offCommand) {
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    // 按下开按钮
    public void onButtonPushed(int index) {
        // 找到你按下的开的按钮， 并调用对应方法
        onCommands[index].execute();
        // 记录这次的操作，用于撤销
        undoCommand = onCommands[index];
    }

    // 按下开按钮
    public void offButtonPushed(int index) {
        // 找到你按下的关的按钮， 并调用对应方法
        offCommands[index].execute();
        // 记录这次的操作，用于撤销
        undoCommand = offCommands[index];

    }

    // 按下撤销按钮
    public void undoButtonPushed() {
        undoCommand.undo();
    }

}
