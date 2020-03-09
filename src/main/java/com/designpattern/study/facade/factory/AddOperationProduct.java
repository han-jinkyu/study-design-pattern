package com.designpattern.study.facade.factory;

public class AddOperationProduct extends AbstractOperationProduct {

    @Override
    public int operate(int leftNumber, int rightNumber) {
        return leftNumber + rightNumber;
    }
}
