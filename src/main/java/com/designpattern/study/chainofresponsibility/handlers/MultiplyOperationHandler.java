package com.designpattern.study.chainofresponsibility.handlers;

import com.designpattern.study.chainofresponsibility.AbstractOperationHandler;
import com.designpattern.study.chainofresponsibility.Request;

public class MultiplyOperationHandler extends AbstractOperationHandler {

    public MultiplyOperationHandler(String operator) {
        super(operator);
    }

    @Override
    protected int operate(Request request) {
        String operator = getOperator();
        int leftNumber = request.getLeftNumber(operator);
        int rightNumber = request.getRightNumber(operator);
        return leftNumber * rightNumber;
    }
}
