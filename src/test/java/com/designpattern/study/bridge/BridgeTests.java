package com.designpattern.study.bridge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BridgeTests {

    private int leftNumber, rightNumber;
    private OperationAbstraction operationAbstraction;

    @Before
    public void setup() {
        leftNumber = 100;
        rightNumber = 20;

        operationAbstraction = new RefinedOperationAbstract(new BaseOperation());
    }

    @Test
    public void should_Be120_When_AddOperation() {
        // given
        int given = leftNumber + rightNumber;

        // when
        int result = operationAbstraction.add(leftNumber, rightNumber);

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_Be80_When_SubtractOperation() {
        // given
        int given = leftNumber - rightNumber;

        // when
        int result = operationAbstraction.subtract(leftNumber, rightNumber);

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_Be2000_When_MultiplyOperation() {
        // given
        int given = leftNumber * rightNumber;

        // when
        int result = operationAbstraction.multiply(leftNumber, rightNumber);

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_Be5_When_DivideOperation() {
        // given
        int given = leftNumber / rightNumber;

        // when
        int result = operationAbstraction.divide(leftNumber, rightNumber);

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_Be10_When_SqrtOperation() {
        // given
        int given = (int)Math.sqrt(leftNumber);

        // when
        int result = ((RefinedOperationAbstract)operationAbstraction).sqrt(leftNumber);

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_Be2147483647_When_AddOperation() {
        // given
        int given = (int)Math.pow(leftNumber, rightNumber);

        // when
        int result = ((RefinedOperationAbstract)operationAbstraction).pow(leftNumber, rightNumber);

        // then
        assertEquals(given, result);
    }
}
