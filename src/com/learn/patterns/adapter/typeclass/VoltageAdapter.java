package com.learn.patterns.adapter.typeclass;

/**
 * @author lijy
 * @date 2019-11-27
 * @description 适配器
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    private String voltage;

    public VoltageAdapter(String voltage) {
        this.voltage = voltage;
    }

    @Override
    public void output5V() {
        // 可扩展方法output220V，而不修改output220V的源码
        System.out.println("调用5V...");
        if ("220".equals(voltage)) {
            output220V();
        }
    }
}
