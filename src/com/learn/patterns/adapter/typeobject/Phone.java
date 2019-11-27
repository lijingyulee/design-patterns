package com.learn.patterns.adapter.typeobject;

/**
 * @author lijy
 * @date 2019-11-27
 * @description 手机
 */
public class Phone {
    public void charging(IVoltage5V iVoltage5V) {
        // 手机充电只能使用5V电压
        iVoltage5V.output5V();
    }
}
