package com.designpattern.study.decorator;

import java.util.ArrayList;

public abstract class AbstractOperandExpression extends AbstractExpression {

    protected ArrayList<AbstractExpression> operandList = new ArrayList<>();

    public void addOperandExpression(AbstractExpression operandExpression) {
        operandList.add(operandExpression);
    }
}
