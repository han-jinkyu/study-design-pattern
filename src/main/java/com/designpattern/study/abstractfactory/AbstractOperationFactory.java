package com.designpattern.study.abstractfactory;

public abstract class AbstractOperationFactory {

    public abstract AbstractOperationProduct createOperationProduct();

    public abstract AbstractNumberOperandProduct createNumberOperationProduct(String value);
}
