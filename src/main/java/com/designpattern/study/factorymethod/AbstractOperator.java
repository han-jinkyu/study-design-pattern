package com.designpattern.study.factorymethod;

/**
 * Product 추상 클래스 역할
 */
public abstract class AbstractOperator {

    protected abstract int getAnswer(int leftNumber, int rightNumber);

    public abstract String getDescription();
}
