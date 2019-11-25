package com.learn.patterns.simplefactory.demo2;

/**
 * @author lijy
 * @date 2019-11-25
 * @description
 */
public class Demo2Test {
    public static void main(String[] args) {
        IOperation addOperation = OperationFactory.getOperation("add");
        double result1 = addOperation.getResult(1.0, 2.0);
        System.out.println("result1 = " + result1);

        IOperation subOperation = OperationFactory.getOperation("sub");
        double result2 = subOperation.getResult(10.0, 2.0);
        System.out.println("result2 = " + result2);

        /**
         * result1 = 3.0
         * result2 = 8.0
         */
    }
}
