package com.designpattern.study.abstractfactory.integerNumber;

import com.designpattern.study.abstractfactory.AbstractNumberOperandProduct;

public class IntegerNumberOperandProduct extends AbstractNumberOperandProduct {

    public IntegerNumberOperandProduct(String value) {
        super(value);
    }

    @Override
    public double getNumber() {
        String value = getValue();
        return (int)(Double.parseDouble(value));
    }
}
