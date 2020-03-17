package com.designpattern.study.interpreter;

import com.designpattern.study.interpreter.CalcContext;
import com.designpattern.study.interpreter.CalcParseException;

public abstract class AbstractExpression {

    public abstract void parse(CalcContext context) throws CalcParseException;
    public abstract double operate();
}
