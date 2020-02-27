package com.designpattern.study.factorymethod.operators;

import com.designpattern.study.factorymethod.AbstractOperator;

public class DivideOperator extends AbstractOperator {

    @Override
    protected int getAnswer(int leftNumber, int rightNumber) {
        return leftNumber / rightNumber;
    }

    @Override
    public String getDescription() {
        return " / ";
    }
}
