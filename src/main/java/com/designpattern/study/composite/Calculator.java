package com.designpattern.study.composite;

public class Calculator {

    private AbstractExpression abstractExpression;

    public Calculator() {
    }

    public int calculate() {
        return abstractExpression.operate();
    }

    public void setAbstractExpression(AbstractExpression abstractExpression) {
        this.abstractExpression = abstractExpression;
    }
}
