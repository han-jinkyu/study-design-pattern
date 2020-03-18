package com.designpattern.study.iterator;

import java.util.ArrayList;

public class OperationAggregate extends AbstractAggregate {

    private ArrayList<AbstractOperation> operations = new ArrayList<>();

    public OperationAggregate() {
        super();
    }

    public void addOperation(AbstractOperation operation) {
        operations.add(operation);
    }

    @Override
    public CalcIterator createIterator() {
        return new CalcIteratorImpl(this);
    }

    public int getSize() {
        return operations.size();
    }

    public AbstractOperation getOperationAt(int index) {
        return operations.get(index);
    }
}
