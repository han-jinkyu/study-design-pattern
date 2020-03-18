package com.designpattern.study.iterator.operations;

import com.designpattern.study.iterator.AbstractOperation;

public class MultiplyOperation extends AbstractOperation {

    @Override
    protected int getAnswer(int leftNumber, int rightNumber) {
        return leftNumber * rightNumber;
    }
}
