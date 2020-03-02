package com.designpattern.study.abstractfactory.integerNumber;

import com.designpattern.study.abstractfactory.AbstractNumberOperandProduct;
import com.designpattern.study.abstractfactory.AbstractOperationFactory;
import com.designpattern.study.abstractfactory.AbstractOperationProduct;

public class IntegerOperationFactory extends AbstractOperationFactory {
    @Override
    public AbstractOperationProduct createOperationProduct() {
        return new IntegerOperationProduct();
    }

    @Override
    public AbstractNumberOperandProduct createNumberOperationProduct(String value) {
        return new IntegerNumberOperandProduct(value);
    }
}
