package com.designpattern.study.adapter;

public class DivideOperationAdapter extends AbstractOperationTarget {

    private OperationAdaptee operationAdaptee;

    public DivideOperationAdapter(OperationAdaptee operationAdaptee) {
        this.operationAdaptee = operationAdaptee;
    }

    @Override
    public int operate(int leftNumber, int rightNumber) {
        return operationAdaptee.calculate(OperationAdaptee.DIVIDE_OPERATION, leftNumber, rightNumber);
    }
}
