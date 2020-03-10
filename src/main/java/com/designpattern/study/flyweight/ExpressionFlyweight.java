package com.designpattern.study.flyweight;

public class ExpressionFlyweight {

    private String operand;
    private int leftNumber;
    private int rightNumber;

    public ExpressionFlyweight(String operand, int leftNumber, int rightNumber) {
        this.operand = operand;
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
    }

    public String getOperand() {
        return operand;
    }

    public int getLeftNumber() {
        return leftNumber;
    }

    public int getRightNumber() {
        return rightNumber;
    }

    public String operate() {
        return String.format("%d%s%d", leftNumber, operand, rightNumber);
    }
}
