package com.designpattern.study.proxy;

import com.designpattern.study.proxy.exception.OperationException;

public abstract class AbstractOperationSubject {

    public abstract int operate(int leftNumber, int rightNumber) throws OperationException;
}
