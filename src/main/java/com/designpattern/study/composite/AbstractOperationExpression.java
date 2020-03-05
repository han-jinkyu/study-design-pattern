package com.designpattern.study.composite;

import java.util.ArrayList;

public abstract class AbstractOperationExpression extends AbstractExpression {

    protected ArrayList<AbstractExpression> operandList = new ArrayList<>();

    public void addOperandExpression(AbstractExpression operandExpression) {
        operandList.add(operandExpression);
    }
}
