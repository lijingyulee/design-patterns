package com.learn.patterns.visitor.demo01;

/**
 * @author lijy
 * @date 2019-11-29
 * @description
 */
public interface IBill {
    void accept(IVisitor visitor);
}
