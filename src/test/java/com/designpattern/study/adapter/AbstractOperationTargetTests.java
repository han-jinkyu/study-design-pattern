package com.designpattern.study.adapter;

import com.designpattern.study.adapter.operations.AddOperation;
import com.designpattern.study.adapter.operations.MultiplyOperation;
import com.designpattern.study.adapter.operations.SubtractOperation;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbstractOperationTargetTests {

    private int leftNumber, rightNumber;

    @Before
    public void setup() {
        leftNumber = 100;
        rightNumber = 20;
    }

    @Test
    public void should_Be120_When_AddOperation() {
        // given
        AbstractOperationTarget operationTarget = new AddOperation();
        int given = leftNumber + rightNumber;

        // when
        int result = operationTarget.operate(leftNumber, rightNumber);

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_Be80_When_SubtractOperation() {
        // given
        AbstractOperationTarget operationTarget = new SubtractOperation();
        int given = leftNumber - rightNumber;

        // when
        int result = operationTarget.operate(leftNumber, rightNumber);

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_Be2000_When_MultiplyOperation() {
        // given
        AbstractOperationTarget operationTarget = new MultiplyOperation();
        int given = leftNumber * rightNumber;

        // when
        int result = operationTarget.operate(leftNumber, rightNumber);

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_Be5_When_DivideOperation() {
        // given
        OperationAdaptee operationAdaptee = new OperationAdaptee();
        AbstractOperationTarget operationTarget = new DivideOperationAdapter(operationAdaptee);
        int given = leftNumber / rightNumber;

        // when
        int result = operationTarget.operate(leftNumber, rightNumber);

        // then
        assertEquals(given, result);
    }
}
