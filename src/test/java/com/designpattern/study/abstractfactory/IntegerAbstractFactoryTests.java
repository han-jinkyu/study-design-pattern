package com.designpattern.study.abstractfactory;

import com.designpattern.study.abstractfactory.integerNumber.IntegerOperationFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerAbstractFactoryTests {

    private String leftNumber, rightNumber;
    private AbstractOperationProduct operationProduct;

    @Before
    public void setup() {
        leftNumber = "10.3";
        rightNumber = "20.2";

        AbstractOperationFactory operationFactory = new IntegerOperationFactory();

        AbstractNumberOperandProduct leftNumberProduct = operationFactory.createNumberOperationProduct(leftNumber);
        AbstractNumberOperandProduct rightNumberProduct = operationFactory.createNumberOperationProduct(rightNumber);

        operationProduct = operationFactory.createOperationProduct();
        operationProduct.setLeftNumberOperandProduct(leftNumberProduct);
        operationProduct.setRightNumberOperandProduct(rightNumberProduct);
    }

    @Test
    public void should_BeAddOperations_When_CreateAddOperation() {
        // given
        int left = (int)Double.parseDouble(leftNumber);
        int right = (int)Double.parseDouble(rightNumber);
        String given = String.format("%d %s %d = %d", left, "+", right, left + right);

        // when
        String operation = operationProduct.createAddOperation();

        // then
        assertEquals(given, operation);
    }

    @Test
    public void should_BeSubtractOperations_When_CreateSubtractOperation() {
        // given
        int left = (int)Double.parseDouble(leftNumber);
        int right = (int)Double.parseDouble(rightNumber);
        String given = String.format("%d %s %d = %d", left, "-", right, left - right);

        // when
        String operation = operationProduct.createSubtractOperation();

        // then
        assertEquals(given, operation);
    }

    @Test
    public void should_BeMultiplyOperations_When_CreateAddOperation() {
        // given
        int left = (int)Double.parseDouble(leftNumber);
        int right = (int)Double.parseDouble(rightNumber);
        String given = String.format("%d %s %d = %d", left, "*", right, left * right);

        // when
        String operation = operationProduct.createMultiplyOperation();

        // then
        assertEquals(given, operation);
    }

    @Test
    public void should_BeDivideOperations_When_CreateDivideOperation() {
        // given
        int left = (int)Double.parseDouble(leftNumber);
        int right = (int)Double.parseDouble(rightNumber);
        String given = String.format("%d %s %d = %d", left, "/", right, left / right);

        // when
        String operation = operationProduct.createDivideOperation();

        // then
        assertEquals(given, operation);
    }
}
