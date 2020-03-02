package com.designpattern.study.abstractfactory.doubleNumber;

import com.designpattern.study.abstractfactory.AbstractNumberOperandProduct;

public class DoubleNumberOperandProduct extends AbstractNumberOperandProduct {

    public DoubleNumberOperandProduct(String value) {
        super(value);
    }

    @Override
    public double getNumber() {
        return Double.parseDouble(getValue());
    }
}
