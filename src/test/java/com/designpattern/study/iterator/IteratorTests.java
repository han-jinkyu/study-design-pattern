package com.designpattern.study.iterator;

import com.designpattern.study.iterator.operations.AddOperation;
import com.designpattern.study.iterator.operations.DivideOperation;
import com.designpattern.study.iterator.operations.MultiplyOperation;
import com.designpattern.study.iterator.operations.SubtractOperation;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IteratorTests {

    private static CalcIterator calcIterator;
    private int leftNumber, rightNumber;

    @BeforeClass
    public static void setupClass() {
        OperationAggregate operationAggregate = new OperationAggregate();
        operationAggregate.addOperation(new AddOperation());
        operationAggregate.addOperation(new SubtractOperation());
        operationAggregate.addOperation(new MultiplyOperation());
        operationAggregate.addOperation(new DivideOperation());
        calcIterator = operationAggregate.createIterator();
    }

    @Before
    public void setup() {
        leftNumber = 100;
        rightNumber = 20;
    }

    @Test
    public void test1_should_Be120_When_GetFirstOperation() {
        // given
        int given = leftNumber + rightNumber;

        // when
        AbstractOperation operation = calcIterator.next();
        int result = operation.getAnswer(leftNumber, rightNumber);

        // then
        assertEquals(given, result);
    }

    @Test
    public void test2_should_Be80_When_GetSecondOperation() {
        // given
        int given = leftNumber - rightNumber;

        // when
        AbstractOperation operation = calcIterator.next();
        int result = operation.getAnswer(leftNumber, rightNumber);

        // then
        assertEquals(given, result);
    }

    @Test
    public void test3_should_Be2000_When_GetThirdOperation() {
        // given
        int given = leftNumber * rightNumber;

        // when
        AbstractOperation operation = calcIterator.next();
        int result = operation.getAnswer(leftNumber, rightNumber);

        // then
        assertEquals(given, result);
    }

    @Test
    public void test4_should_Be5_When_GetFourthOperation() {
        // given
        int given = leftNumber / rightNumber;

        // when
        AbstractOperation operation = calcIterator.next();
        int result = operation.getAnswer(leftNumber, rightNumber);

        // then
        assertEquals(given, result);
    }

    @Test
    public void test5_should_BeFalse_When_GetFifthOperation() {
        // given
        boolean given = false;

        // when
        boolean hasNext = calcIterator.hasNext();

        // then
        assertEquals(given, hasNext);
    }
}
