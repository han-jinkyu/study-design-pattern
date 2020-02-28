package com.designpattern.study.prototype;

public abstract class AbstractOperationPrototype {

    private int leftNumber, rightNumber;

    public AbstractOperationPrototype() {
        super();
    }

    public abstract AbstractOperationPrototype getClone();

    protected abstract int getAnswer();

    protected abstract String getOperator();

    public final String operate() {
        String operator = getOperator();
        int answer = getAnswer();
        return String.format("%d %s %d = %d", leftNumber, operator, rightNumber, answer);
    }

    public int getLeftNumber() {
        return leftNumber;
    }

    public void setLeftNumber(int leftNumber) {
        this.leftNumber = leftNumber;
    }

    public int getRightNumber() {
        return rightNumber;
    }

    public void setRightNumber(int rightNumber) {
        this.rightNumber = rightNumber;
    }
}
