package com.designpattern.study.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OperationSingletonTests {

    private OperationSingleton operationSingleton;
    private int leftNumber, rightNumber;

    @Before
    public void setup() {
        operationSingleton = OperationSingleton.getInstance();
        leftNumber = 100;
        rightNumber = 20;
    }

    @Test
    public void should_Be120_When_AddOperation() throws Exception {
        // given
        int given = leftNumber + rightNumber;

        // when
        int value = operationSingleton.operate(OperationSingleton.ADD_OPERATION, leftNumber, rightNumber);

        // then
        Assert.assertEquals(given, value);
    }

    @Test
    public void should_Be80_When_SubtractOperation() throws Exception {
        // given
        int given = leftNumber - rightNumber;

        // when
        int value = operationSingleton.operate(OperationSingleton.SUBTRACT_OPERATION, leftNumber, rightNumber);

        // then
        Assert.assertEquals(given, value);
    }

    @Test
    public void should_Be2000_When_MultiplyOperation() throws Exception {
        // given
        int given = leftNumber * rightNumber;

        // when
        int value = operationSingleton.operate(OperationSingleton.MULTIPLY_OPERATION, leftNumber, rightNumber);

        // then
        Assert.assertEquals(given, value);
    }

    @Test
    public void should_Be5_When_DivideOperation() throws Exception {
        // given
        int given = leftNumber / rightNumber;

        // when
        int value = operationSingleton.operate(OperationSingleton.DIVIDE_OPERATION, leftNumber, rightNumber);

        // then
        Assert.assertEquals(given, value);
    }

    @Test
    public void should_Equals_When_GetInstance() {
        // when
        OperationSingleton given = OperationSingleton.getInstance();

        // then
        Assert.assertEquals(given, operationSingleton);
    }
}
