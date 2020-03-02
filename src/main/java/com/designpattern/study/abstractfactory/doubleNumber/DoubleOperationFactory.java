package com.designpattern.study.abstractfactory.doubleNumber;

import com.designpattern.study.abstractfactory.AbstractNumberOperandProduct;
import com.designpattern.study.abstractfactory.AbstractOperationFactory;
import com.designpattern.study.abstractfactory.AbstractOperationProduct;

public class DoubleOperationFactory extends AbstractOperationFactory {

    @Override
    public AbstractOperationProduct createOperationProduct() {
        return new DoubleOperationProduct();
    }

    @Override
    public AbstractNumberOperandProduct createNumberOperationProduct(String value) {
        return new DoubleNumberOperandProduct(value);
    }
}
