package com.designpattern.study.proxy.subjects;

import com.designpattern.study.proxy.AbstractOperationSubject;
import com.designpattern.study.proxy.exception.OperationException;

public class MultiplyOperationSubject extends AbstractOperationSubject {

    @Override
    public int operate(int leftNumber, int rightNumber) throws OperationException {
        return leftNumber * rightNumber;
    }
}
