package com.designpattern.study.facade.factory;

public class MultiplyOperationProduct extends AbstractOperationProduct {

    @Override
    public int operate(int leftNumber, int rightNumber) {
        return leftNumber * rightNumber;
    }
}
