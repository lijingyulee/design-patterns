package com.learn.patterns.command.demo01;

/**
 * @author lijy
 * @date 2019-11-29
 * @description
 */
public class Command01Test {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        LightReceiver lightReceiver = new LightReceiver();
        TVReceiver tvReceiver = new TVReceiver();
        remoteController.setCommand(0, new LightOnCommand(lightReceiver), new LightOffCommand(lightReceiver));
        remoteController.setCommand(1, new TVOnCommand(tvReceiver), new TVOffCommand(tvReceiver));

        remoteController.onButtonPushed(0);
        remoteController.onButtonPushed(1);

        remoteController.offButtonPushed(0);
        remoteController.undoButtonPushed();

        /**
         *  电灯打开了..
         *  电视机打开了..
         *  电灯关闭了..
         *  电灯打开了..
         */

    }
}
