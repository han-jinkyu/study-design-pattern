package com.designpattern.study.composite.operationExpression;

import com.designpattern.study.composite.AbstractExpression;
import com.designpattern.study.composite.AbstractOperationExpression;

public class DivideOperationExpression extends AbstractOperationExpression {

    @Override
    public int operate() {
        AbstractExpression first = operandList.get(0);
        AbstractExpression second = operandList.get(1);

        int firstResult = first.operate();
        int secondResult = second.operate();

        return firstResult / secondResult;
    }
}
