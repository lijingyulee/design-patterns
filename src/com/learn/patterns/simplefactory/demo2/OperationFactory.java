package com.learn.patterns.simplefactory.demo2;

import org.omg.CORBA.StringHolder;

/**
 * @author lijy
 * @date 2019-11-25
 * @description
 */
public class OperationFactory {
    private static final String OPERATION_TYPE_ADD = "add";
    private static final String OPERATION_TYPE_SUB = "sub";

    public static IOperation getOperation(String type) {
        switch (type) {
            case OPERATION_TYPE_ADD:
                return new AddOperation();
            case OPERATION_TYPE_SUB:
                return new SubOperation();
            default:
                return new AddOperation();
        }
    }
}
