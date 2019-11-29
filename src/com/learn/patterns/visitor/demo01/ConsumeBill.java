package com.learn.patterns.visitor.demo01;

/**
 * @author lijy
 * @date 2019-11-29
 * @description
 */
public class ConsumeBill extends AbstractBill {

    public ConsumeBill(String item, Double amount) {
        super(item, amount);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visitorConsumeBill(this);
    }
}
