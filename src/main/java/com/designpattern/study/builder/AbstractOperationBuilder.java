package com.designpattern.study.builder;

public abstract class AbstractOperationBuilder {

    protected StringBuffer result = new StringBuffer();

    private int leftNumber, rightNumber;

    public AbstractOperationBuilder(int leftNumber, int rightNumber) {
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
    }

    public abstract int operate();

    public abstract void buildOperator();

    public final void buildLeftNumber() {
        result.append(leftNumber);
    }

    public final void buildRightNumber() {
        result.append(rightNumber);
    }

    public final void buildAnswer() {
        int answer = operate();
        result.append(" = ").append(answer);
    }

    public final String getResult() {
        return result.toString();
    }

    public int getLeftNumber() {
        return leftNumber;
    }

    public int getRightNumber() {
        return rightNumber;
    }
}
