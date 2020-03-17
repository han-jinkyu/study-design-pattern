package com.designpattern.study.composite;

import com.designpattern.study.composite.operationExpression.AddOperationExpression;
import com.designpattern.study.composite.operationExpression.DivideOperationExpression;
import com.designpattern.study.composite.operationExpression.MultiplyOperationExpression;
import com.designpattern.study.composite.operationExpression.SubtractOperationExpression;
import com.designpattern.study.factorymethod.AbstractOperation;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompositeTests {

    private int leftNumber, rightNumber;
    private Calculator calculator;

    @Before
    public void setup() {
        leftNumber = 100;
        rightNumber = 20;
        calculator = new Calculator();
    }

    @Test
    public void should_Be100_When_NumberExpressionIs100() {
        // given
        int given = leftNumber;

        // when
        AbstractExpression expression = new NumberExpression(leftNumber);
        calculator.setAbstractExpression(expression);
        int result = calculator.calculate();

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_Be20_When_NumberExpressionIs20() {
        // given
        int given = rightNumber;

        // when
        AbstractExpression expression = new NumberExpression(rightNumber);
        calculator.setAbstractExpression(expression);
        int result = calculator.calculate();

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_Be120_When_AddOperationExpression() {
        // given
        int given = leftNumber + rightNumber;

        // when
        AbstractOperationExpression expression = new AddOperationExpression();

        AbstractExpression leftNumberExpression = new NumberExpression(leftNumber);
        AbstractExpression rightNumberExpression = new NumberExpression(rightNumber);
        expression.addOperandExpression(leftNumberExpression);
        expression.addOperandExpression(rightNumberExpression);

        calculator.setAbstractExpression(expression);

        // then
        int result = calculator.calculate();
        assertEquals(given, result);
    }

    @Test
    public void should_Be80_When_SubtractOperationExpression() {
        // given
        int given = leftNumber - rightNumber;

        // when
        AbstractOperationExpression expression = new SubtractOperationExpression();

        AbstractExpression leftNumberExpression = new NumberExpression(leftNumber);
        AbstractExpression rightNumberExpression = new NumberExpression(rightNumber);
        expression.addOperandExpression(leftNumberExpression);
        expression.addOperandExpression(rightNumberExpression);

        calculator.setAbstractExpression(expression);

        // then
        int result = calculator.calculate();
        assertEquals(given, result);
    }

    @Test
    public void should_Be2000_When_MultiplyOperationExpression() {
        // given
        int given = leftNumber * rightNumber;

        // when
        AbstractOperationExpression expression = new MultiplyOperationExpression();

        AbstractExpression leftNumberExpression = new NumberExpression(leftNumber);
        AbstractExpression rightNumberExpression = new NumberExpression(rightNumber);
        expression.addOperandExpression(leftNumberExpression);
        expression.addOperandExpression(rightNumberExpression);

        calculator.setAbstractExpression(expression);

        // then
        int result = calculator.calculate();
        assertEquals(given, result);
    }

    @Test
    public void should_Be5_When_DivideOperationExpression() {
        // given
        int given = leftNumber / rightNumber;

        // when
        AbstractOperationExpression expression = new DivideOperationExpression();

        AbstractExpression leftNumberExpression = new NumberExpression(leftNumber);
        AbstractExpression rightNumberExpression = new NumberExpression(rightNumber);
        expression.addOperandExpression(leftNumberExpression);
        expression.addOperandExpression(rightNumberExpression);

        calculator.setAbstractExpression(expression);

        // then
        int result = calculator.calculate();
        assertEquals(given, result);
    }
}
