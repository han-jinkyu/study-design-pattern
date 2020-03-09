package com.designpattern.study.facade;

import com.designpattern.study.facade.factory.AbstractOperationProduct;
import com.designpattern.study.facade.factory.OperationFactory;

public class CalculatorFacade {

    private ExpressionParser expressionParser;
    private OperationFactory operationFactory;

    public CalculatorFacade() {
        expressionParser = new ExpressionParser();
        operationFactory = new OperationFactory();
    }

    public int calculate(String expression) {
        expressionParser.parse(expression);

        String operandToken = expressionParser.getOperatorToken();
        String leftNumberToken = expressionParser.getLeftNumberToken();
        String rightNumberToken = expressionParser.getRightNumberToken();

        NumberOperand leftNumberOperand = new NumberOperand(leftNumberToken);
        NumberOperand rightNumberOperand = new NumberOperand(rightNumberToken);

        int leftNumber = leftNumberOperand.getNumber();
        int rightNumber = rightNumberOperand.getNumber();

        AbstractOperationProduct operationProduct = operationFactory.createOperationProduct(operandToken);
        return operationProduct.operate(leftNumber, rightNumber);
    }
}
