package com.designpattern.study.abstractfactory.integerNumber;

import com.designpattern.study.abstractfactory.AbstractOperationProduct;

public class IntegerOperationProduct extends AbstractOperationProduct {

    @Override
    public String createAddOperation() {
        int leftNumber = (int)getLeftNumber();
        int rightNumber = (int)getRightNumber();
        return String.format("%d %s %d = %d", leftNumber, "+", rightNumber, leftNumber + rightNumber);
    }

    @Override
    public String createSubtractOperation() {
        int leftNumber = (int)getLeftNumber();
        int rightNumber = (int)getRightNumber();
        return String.format("%d %s %d = %d", leftNumber, "-", rightNumber, leftNumber - rightNumber);
    }

    @Override
    public String createMultiplyOperation() {
        int leftNumber = (int)getLeftNumber();
        int rightNumber = (int)getRightNumber();
        return String.format("%d %s %d = %d", leftNumber, "*", rightNumber, leftNumber * rightNumber);
    }

    @Override
    public String createDivideOperation() {
        int leftNumber = (int)getLeftNumber();
        int rightNumber = (int)getRightNumber();
        return String.format("%d %s %d = %d", leftNumber, "/", rightNumber, leftNumber / rightNumber);
    }
}
