package com.designpattern.study.prototype.prototypes;

import com.designpattern.study.prototype.AbstractOperationPrototype;

public class SubtractOperationPrototype extends AbstractOperationPrototype {

    public SubtractOperationPrototype() {
        super();
    }

    @Override
    public AbstractOperationPrototype getClone() {
        return new SubtractOperationPrototype();
    }

    @Override
    protected int getAnswer() {
        return getLeftNumber() - getRightNumber();
    }

    @Override
    protected String getOperator() {
        return "-";
    }
}
