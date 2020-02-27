package com.designpattern.study.factorymethod.operations;

import com.designpattern.study.factorymethod.AbstractOperation;
import com.designpattern.study.factorymethod.AbstractOperator;
import com.designpattern.study.factorymethod.operators.SubtractOperator;

public class SubtractOperation extends AbstractOperation {
    @Override
    protected AbstractOperator getOperator() {
        return new SubtractOperator();
    }
}
