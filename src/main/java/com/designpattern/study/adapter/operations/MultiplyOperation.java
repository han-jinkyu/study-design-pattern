package com.designpattern.study.adapter.operations;

import com.designpattern.study.adapter.AbstractOperationTarget;

public class MultiplyOperation extends AbstractOperationTarget {

    @Override
    public int operate(int leftNumber, int rightNumber) {
        return leftNumber * rightNumber;
    }
}
