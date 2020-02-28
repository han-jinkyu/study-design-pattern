package com.designpattern.study.prototype.prototypes;

import com.designpattern.study.prototype.AbstractOperationPrototype;

public class MultiplyOperationPrototype extends AbstractOperationPrototype {

    public MultiplyOperationPrototype() {
        super();
    }

    @Override
    public AbstractOperationPrototype getClone() {
        return new MultiplyOperationPrototype();
    }

    @Override
    protected int getAnswer() {
        return getLeftNumber() * getRightNumber();
    }

    @Override
    protected String getOperator() {
        return "*";
    }
}
