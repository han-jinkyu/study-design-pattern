package com.designpattern.study.decorator.operations;

import com.designpattern.study.decorator.AbstractExpression;
import com.designpattern.study.decorator.AbstractOperandExpression;

public class AddOperandExpression extends AbstractOperandExpression {

    @Override
    public int operate() {
        AbstractExpression leftNumberExpression = operandList.get(0);
        AbstractExpression rightNumberExpression = operandList.get(1);
        return leftNumberExpression.operate() + rightNumberExpression.operate();
    }
}
