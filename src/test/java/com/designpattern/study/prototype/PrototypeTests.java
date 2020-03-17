package com.designpattern.study.prototype;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrototypeTests {

    private OperatorBendingMachine operatorBendingMachine;
    private int leftNumber, rightNumber;

    @Before
    public void setup() {
        operatorBendingMachine = new OperatorBendingMachine();
        leftNumber = 100;
        rightNumber = 20;
    }

    @Test
    public void should_BeAddOperator_When_AddOperationPrototype() {
        // given
        String operator = "+";
        String given = String.format("%d %s %d = %d", leftNumber, operator, rightNumber, leftNumber + rightNumber);

        AbstractOperationPrototype operationPrototype = operatorBendingMachine.getOperationClone(operator);
        operationPrototype.setLeftNumber(leftNumber);
        operationPrototype.setRightNumber(rightNumber);

        // when
        String result = operationPrototype.operate();

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_BeSubtractOperator_When_SubtractOperationPrototype() {
        // given
        String operator = "-";
        String given = String.format("%d %s %d = %d", leftNumber, operator, rightNumber, leftNumber - rightNumber);

        AbstractOperationPrototype operationPrototype = operatorBendingMachine.getOperationClone(operator);
        operationPrototype.setLeftNumber(leftNumber);
        operationPrototype.setRightNumber(rightNumber);

        // when
        String result = operationPrototype.operate();

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_BeMultiplyOperator_When_MultiplyOperationPrototype() {
        // given
        String operator = "*";
        String given = String.format("%d %s %d = %d", leftNumber, operator, rightNumber, leftNumber * rightNumber);

        AbstractOperationPrototype operationPrototype = operatorBendingMachine.getOperationClone(operator);
        operationPrototype.setLeftNumber(leftNumber);
        operationPrototype.setRightNumber(rightNumber);

        // when
        String result = operationPrototype.operate();

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_BeDivideOperator_When_DivideOperationPrototype() {
        // given
        String operator = "/";
        String given = String.format("%d %s %d = %d", leftNumber, operator, rightNumber, leftNumber /rightNumber);

        AbstractOperationPrototype operationPrototype = operatorBendingMachine.getOperationClone(operator);
        operationPrototype.setLeftNumber(leftNumber);
        operationPrototype.setRightNumber(rightNumber);

        // when
        String result = operationPrototype.operate();

        // then
        assertEquals(given, result);
    }
}
