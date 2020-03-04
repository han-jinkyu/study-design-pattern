package com.designpattern.study.bridge;

public abstract class OperationAbstraction {

    private IBaseOperationImplementor implementor;

    public OperationAbstraction(IBaseOperationImplementor implementor) {
        this.implementor = implementor;
    }

    public int add(int leftNumber, int rightNumber) {
        return this.implementor.add(leftNumber, rightNumber);
    }

    public int subtract(int leftNumber, int rightNumber) {
        return this.implementor.subtract(leftNumber, rightNumber);
    }

    public int multiply(int leftNumber, int rightNumber) {
        return this.implementor.multiply(leftNumber, rightNumber);
    }

    public int divide(int leftNumber, int rightNumber) {
        return this.implementor.divide(leftNumber, rightNumber);
    }
}
