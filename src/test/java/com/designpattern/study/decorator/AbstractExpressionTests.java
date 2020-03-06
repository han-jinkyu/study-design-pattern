package com.designpattern.study.decorator;

import com.designpattern.study.decorator.operations.AddOperandExpression;
import com.designpattern.study.decorator.operations.DivideOperandExpression;
import com.designpattern.study.decorator.operations.MultiplyOperandExpression;
import com.designpattern.study.decorator.operations.SubtractOperandExpression;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbstractExpressionTests {

    private int leftNumber, rightNumber;

    @Before
    public void setup() {
        leftNumber = 100;
        rightNumber = 20;
    }

    @Test
    public void should_Be100_When_LeftNumberOperation() {
        // when
        AbstractExpression expression = new NumberExpression(leftNumber);

        // then
        int result = expression.operate();
        assertEquals(leftNumber, result);
    }

    @Test
    public void should_Be20_When_RightNumberOperation() {
        // when
        AbstractExpression expression = new NumberExpression(rightNumber);

        // then
        int result = expression.operate();
        assertEquals(rightNumber, result);
    }

    @Test
    public void should_Be120_When_AddOperationExpression() {
        // given
        int given = leftNumber + rightNumber;

        // when
        AbstractExpression leftNumberExpression = new NumberExpression(leftNumber);
        AbstractExpression rightNumberExpression = new NumberExpression(rightNumber);

        AbstractOperandExpression operandExpression = new AddOperandExpression();
        operandExpression.addOperandExpression(leftNumberExpression);
        operandExpression.addOperandExpression(rightNumberExpression);

        // then
        int result = operandExpression.operate();
        assertEquals(given, result);
    }

    @Test
    public void should_Be80_When_SubtractOperationExpression() {
        // given
        int given = leftNumber - rightNumber;

        // when
        AbstractExpression leftNumberExpression = new NumberExpression(leftNumber);
        AbstractExpression rightNumberExpression = new NumberExpression(rightNumber);

        AbstractOperandExpression operandExpression = new SubtractOperandExpression();
        operandExpression.addOperandExpression(leftNumberExpression);
        operandExpression.addOperandExpression(rightNumberExpression);

        // then
        int result = operandExpression.operate();
        assertEquals(given, result);
    }

    @Test
    public void should_Be2000_When_MultiplyOperationExpression() {
        // given
        int given = leftNumber * rightNumber;

        // when
        AbstractExpression leftNumberExpression = new NumberExpression(leftNumber);
        AbstractExpression rightNumberExpression = new NumberExpression(rightNumber);

        AbstractOperandExpression operandExpression = new MultiplyOperandExpression();
        operandExpression.addOperandExpression(leftNumberExpression);
        operandExpression.addOperandExpression(rightNumberExpression);

        // then
        int result = operandExpression.operate();
        assertEquals(given, result);
    }

    @Test
    public void should_Be5_When_DivideOperationExpression() {
        // given
        int given = leftNumber / rightNumber;

        // when
        AbstractExpression leftNumberExpression = new NumberExpression(leftNumber);
        AbstractExpression rightNumberExpression = new NumberExpression(rightNumber);

        AbstractOperandExpression operandExpression = new DivideOperandExpression();
        operandExpression.addOperandExpression(leftNumberExpression);
        operandExpression.addOperandExpression(rightNumberExpression);

        // then
        int result = operandExpression.operate();
        assertEquals(given, result);
    }
}
