package com.designpattern.study.abstractfactory.doubleNumber;

import com.designpattern.study.abstractfactory.AbstractOperationProduct;

public class DoubleOperationProduct extends AbstractOperationProduct {
    @Override
    public String createAddOperation() {
        double leftNumber = getLeftNumber();
        double rightNumber = getRightNumber();
        return String.format("%f %s %f = %f", leftNumber, "+", rightNumber, leftNumber + rightNumber);
    }

    @Override
    public String createSubtractOperation() {
        double leftNumber = getLeftNumber();
        double rightNumber = getRightNumber();
        return String.format("%f %s %f = %f", leftNumber, "-", rightNumber, leftNumber - rightNumber);
    }

    @Override
    public String createMultiplyOperation() {
        double leftNumber = getLeftNumber();
        double rightNumber = getRightNumber();
        return String.format("%f %s %f = %f", leftNumber, "*", rightNumber, leftNumber * rightNumber);
    }

    @Override
    public String createDivideOperation() {
        double leftNumber = getLeftNumber();
        double rightNumber = getRightNumber();
        return String.format("%f %s %f = %f", leftNumber, "/", rightNumber, leftNumber / rightNumber);
    }
}
