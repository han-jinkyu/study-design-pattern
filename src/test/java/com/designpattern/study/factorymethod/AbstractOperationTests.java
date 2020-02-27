package com.designpattern.study.factorymethod;

import com.designpattern.study.factorymethod.operations.AddOperation;
import com.designpattern.study.factorymethod.operations.DivideOperation;
import com.designpattern.study.factorymethod.operations.MultiplyOperation;
import com.designpattern.study.factorymethod.operations.SubtractOperation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbstractOperationTests {

    private AbstractOperation operation;
    private int leftNumber, rightNumber;

    @Before
    public void setup() {
        leftNumber = 100;
        rightNumber = 20;
    }

    @Test
    public void should_BeAddOperator_When_AddOperation() {
        // given
        String given = String.format("%d + %d = %d", leftNumber, rightNumber, leftNumber + rightNumber);
        operation = new AddOperation();
        operation.setLeftNumber(leftNumber);
        operation.setRightNumber(rightNumber);

        // when
        String result = operation.operate();

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_BeSubtractOperator_When_SubtractOperation() {
        // given
        String given = String.format("%d - %d = %d", leftNumber, rightNumber, leftNumber - rightNumber);
        operation = new SubtractOperation();
        operation.setLeftNumber(leftNumber);
        operation.setRightNumber(rightNumber);

        // when
        String result = operation.operate();

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_BeMultiplyOperator_When_MultiplyOperation() {
        // given
        String given = String.format("%d * %d = %d", leftNumber, rightNumber, leftNumber * rightNumber);
        operation = new MultiplyOperation();
        operation.setLeftNumber(leftNumber);
        operation.setRightNumber(rightNumber);

        // when
        String result = operation.operate();

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_BeDivideOperator_When_DivideOperation() {
        // given
        String given = String.format("%d / %d = %d", leftNumber, rightNumber, leftNumber / rightNumber);
        operation = new DivideOperation();
        operation.setLeftNumber(leftNumber);
        operation.setRightNumber(rightNumber);

        // when
        String result = operation.operate();

        // then
        assertEquals(given, result);
    }
}
