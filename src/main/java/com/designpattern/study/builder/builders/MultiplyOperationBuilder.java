package com.designpattern.study.builder.builders;

import com.designpattern.study.builder.AbstractOperationBuilder;

public class MultiplyOperationBuilder extends AbstractOperationBuilder {

    public MultiplyOperationBuilder(int leftNumber, int rightNumber) {
        super(leftNumber, rightNumber);
    }

    @Override
    public int operate() {
        return getLeftNumber() * getRightNumber();
    }

    @Override
    public void buildOperator() {
        result.append(" * ");
    }
}
