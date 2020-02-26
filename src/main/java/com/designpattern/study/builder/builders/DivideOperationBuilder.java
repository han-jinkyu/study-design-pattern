package com.designpattern.study.builder.builders;

import com.designpattern.study.builder.AbstractOperationBuilder;

public class DivideOperationBuilder extends AbstractOperationBuilder {

    public DivideOperationBuilder(int leftNumber, int rightNumber) {
        super(leftNumber, rightNumber);
    }

    @Override
    public int operate() {
        return getLeftNumber() / getRightNumber();
    }

    @Override
    public void buildOperator() {
        result.append(" / ");
    }
}
