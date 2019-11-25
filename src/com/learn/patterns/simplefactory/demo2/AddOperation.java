package com.learn.patterns.simplefactory.demo2;

/**
 * @author lijy
 * @date 2019-11-25
 * @description
 */
public class AddOperation implements IOperation {
    @Override
    public double getResult(double a, double b) {
        return a + b;
    }
}
