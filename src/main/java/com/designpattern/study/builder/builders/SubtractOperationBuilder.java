package com.designpattern.study.builder.builders;

import com.designpattern.study.builder.AbstractOperationBuilder;

public class SubtractOperationBuilder extends AbstractOperationBuilder {

    public SubtractOperationBuilder(int leftNumber, int rightNumber) {
        super(leftNumber, rightNumber);
    }

    @Override
    public int operate() {
        return getLeftNumber() - getRightNumber();
    }

    @Override
    public void buildOperator() {
        result.append(" - ");
    }
}
