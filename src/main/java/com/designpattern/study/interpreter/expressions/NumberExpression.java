package com.designpattern.study.interpreter.expressions;

import com.designpattern.study.interpreter.AbstractExpression;
import com.designpattern.study.interpreter.CalcContext;
import com.designpattern.study.interpreter.CalcParseException;

public class NumberExpression extends AbstractExpression {

    private int value;

    public NumberExpression(int value) {
        this.value = value;
    }

    @Override
    public void parse(CalcContext context) throws CalcParseException {
    }

    @Override
    public double operate() {
        return this.value;
    }
}
