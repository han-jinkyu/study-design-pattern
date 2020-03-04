package com.designpattern.study.bridge;

public class RefinedOperationAbstract extends OperationAbstraction {

    public RefinedOperationAbstract(IBaseOperationImplementor implementor) {
        super(implementor);
    }

    public int sqrt(int number) {
        return (int)Math.sqrt(number);
    }

    public int pow(int first, int second) {
        return (int)Math.pow(first, second);
    }
}
