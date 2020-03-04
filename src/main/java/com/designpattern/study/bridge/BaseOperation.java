package com.designpattern.study.bridge;

public class BaseOperation implements IBaseOperationImplementor {

    @Override
    public int add(int leftNumber, int rightNumber) {
        return leftNumber + rightNumber;
    }

    @Override
    public int subtract(int leftNumber, int rightNumber) {
        return leftNumber - rightNumber;
    }

    @Override
    public int multiply(int leftNumber, int rightNumber) {
        return leftNumber * rightNumber;
    }

    @Override
    public int divide(int leftNumber, int rightNumber) {
        return leftNumber / rightNumber;
    }
}
