package com.learn.patterns.visitor.demo01;

/**
 * @author lijy
 * @date 2019-11-29
 * @description
 */
public class CPAVisitor implements IVisitor {
    @Override
    public void visitorConsumeBill(ConsumeBill bill) {
        if (bill.getItem().equals("工资")) {
            System.out.println("注会查看账本时，如果单子的消费目的是发工资，则注会会查看有没有交个人所得税。");
        }
    }

    @Override
    public void visitorIncomeBill(IncomeBill bill) {
        System.out.println("注会查看账本时，只要是收入，注会都要查看公司交税了没。");
    }
}
