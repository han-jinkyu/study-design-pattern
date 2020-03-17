package com.designpattern.study.interpreter.expressions;

import com.designpattern.study.interpreter.AbstractExpression;

public class AddOperationExpression extends AbstractOperationExpression {

    @Override
    public double operate() {
        AbstractExpression leftOperandExpression = operandList.get(0);
        AbstractExpression rightOperandExpression = operandList.get(1);

        double leftResult = leftOperandExpression.operate();
        double rightResult = rightOperandExpression.operate();

        return leftResult + rightResult;
    }

    @Override
    protected String getFunctionName() {
        return "ADD";
    }
}
