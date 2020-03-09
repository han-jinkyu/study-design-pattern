package com.designpattern.study.facade.factory;

public class OperationFactory {

    public AbstractOperationProduct createOperationProduct(String operandToken) {

        switch (operandToken) {
            case "+":
                return new AddOperationProduct();

            case "-":
                return new SubtractOperationProduct();

            case "*":
                return new MultiplyOperationProduct();

            case "/":
                return new DivideOperationProduct();
        }

        return null;
    }
}
