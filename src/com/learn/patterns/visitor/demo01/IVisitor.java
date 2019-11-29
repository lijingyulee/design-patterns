package com.learn.patterns.visitor.demo01;

/**
 * @author lijy
 * @date 2019-11-29
 * @description
 */
public interface IVisitor {

    void visitorConsumeBill(ConsumeBill bill);

    void visitorIncomeBill(IncomeBill bill);
}
