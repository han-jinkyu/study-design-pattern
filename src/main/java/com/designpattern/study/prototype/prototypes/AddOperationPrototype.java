package com.designpattern.study.prototype.prototypes;

import com.designpattern.study.prototype.AbstractOperationPrototype;

public class AddOperationPrototype extends AbstractOperationPrototype {

    public AddOperationPrototype() {
        super();
    }

    @Override
    public AbstractOperationPrototype getClone() {
        return new AddOperationPrototype();
    }

    @Override
    protected int getAnswer() {
        return getLeftNumber() + getRightNumber();
    }

    @Override
    protected String getOperator() {
        return "+";
    }
}
