package com.designpattern.study.iterator;

public class CalcIteratorImpl implements CalcIterator {

    private OperationAggregate operationAggregate;
    private int index;

    public CalcIteratorImpl(OperationAggregate operationAggregate) {
        this.operationAggregate = operationAggregate;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < operationAggregate.getSize();
    }

    @Override
    public AbstractOperation next() {
        return operationAggregate.getOperationAt(index++);
    }
}
