package com.learn.patterns.adapter.typeobject;

/**
 * @author lijy
 * @date 2019-11-27
 * @description 适配器
 */
public class VoltageAdapter implements IVoltage5V {

    private String voltage;

    public VoltageAdapter(String voltage, Voltage220V voltage220V) {
        this.voltage = voltage;
        this.voltage220V = voltage220V;
    }

    private Voltage220V voltage220V;

    @Override
    public void output5V() {
        // 可扩展方法output220V，而不修改output220V的源码
        System.out.println("调用5V...");
        if ("220".equals(voltage)) {
            voltage220V.output220V();
        }
    }
}
