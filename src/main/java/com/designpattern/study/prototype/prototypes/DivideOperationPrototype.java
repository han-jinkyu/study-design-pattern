package com.designpattern.study.prototype.prototypes;

import com.designpattern.study.prototype.AbstractOperationPrototype;

public class DivideOperationPrototype extends AbstractOperationPrototype {

    public DivideOperationPrototype() {
        super();
    }

    @Override
    public AbstractOperationPrototype getClone() {
        return new DivideOperationPrototype();
    }

    @Override
    protected int getAnswer() {
        return getLeftNumber() / getRightNumber();
    }

    @Override
    protected String getOperator() {
        return "/";
    }
}
