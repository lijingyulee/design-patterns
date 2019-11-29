package com.learn.patterns.visitor.demo01;

import com.sun.javafx.binding.StringFormatter;

/**
 * @author lijy
 * @date 2019-11-29
 * @description
 */
public class BossVisitor implements IVisitor {

    private double totalIncome;

    private double totalConsume;

    @Override
    public void visitorConsumeBill(ConsumeBill bill) {
        totalConsume += bill.getAmount();
    }

    @Override
    public void visitorIncomeBill(IncomeBill bill) {
        totalIncome += bill.getAmount();
    }

    public void getInfo() {
        System.out.println(String.format("老板只关心总数，总收入:%f,总支出：%f", totalIncome, totalConsume));
    }
}
