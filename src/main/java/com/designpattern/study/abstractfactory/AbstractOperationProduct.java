package com.designpattern.study.abstractfactory;

public abstract class AbstractOperationProduct {

    private AbstractNumberOperandProduct leftNumberOperandProduct;

    private AbstractNumberOperandProduct rightNumberOperandProduct;

    public double add() {
        return getLeftNumber() + getRightNumber();
    }

    public double subtract() {
        return getLeftNumber() - getRightNumber();
    }

    public double multiply() {
        return getLeftNumber() * getRightNumber();
    }

    public double divide() {
        return getLeftNumber() / getRightNumber();
    }

    public abstract String createAddOperation();

    public abstract String createSubtractOperation();

    public abstract String createMultiplyOperation();

    public abstract String createDivideOperation();

    public void setLeftNumberOperandProduct(AbstractNumberOperandProduct leftNumberOperandProduct) {
        this.leftNumberOperandProduct = leftNumberOperandProduct;
    }

    public void setRightNumberOperandProduct(AbstractNumberOperandProduct rightNumberOperandProduct) {
        this.rightNumberOperandProduct = rightNumberOperandProduct;
    }

    protected double getLeftNumber() {
        return leftNumberOperandProduct.getNumber();
    }

    protected double getRightNumber() {
        return rightNumberOperandProduct.getNumber();
    }
}
