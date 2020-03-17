package com.designpattern.study.interpreter.expressions;

import com.designpattern.study.interpreter.AbstractExpression;

public abstract class AbstractFunctionExpression extends AbstractExpression {

    protected abstract String getFunctionName();
}
