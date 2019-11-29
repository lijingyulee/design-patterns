package com.learn.patterns.visitor.demo01;

/**
 * @author lijy
 * @date 2019-11-29
 * @description
 */
public class IncomeBill extends AbstractBill {
    public IncomeBill(String item, Double amount) {
        super(item, amount);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitorIncomeBill(this);
    }
}
