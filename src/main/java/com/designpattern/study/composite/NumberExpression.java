package com.designpattern.study.composite;

/**
 * Leaf 역할
 */
public class NumberExpression extends AbstractExpression {

    private int value;

    public NumberExpression(int value) {
        this.value = value;
    }

    @Override
    public int operate() {
        return value;
    }
}
