package com.designpattern.study.proxy;

import com.designpattern.study.proxy.exception.OperationException;

public class DivideOperationProxy extends AbstractOperationSubject {

    private AbstractOperationSubject realOperationSubject;

    public DivideOperationProxy(AbstractOperationSubject realSubject) {
        this.realOperationSubject = realSubject;
    }

    @Override
    public int operate(int leftNumber, int rightNumber) throws OperationException {
        if (rightNumber == 0) {
            throw new OperationException("NonZeroDivideException");
        }
        return realOperationSubject.operate(leftNumber, rightNumber);
    }
}
