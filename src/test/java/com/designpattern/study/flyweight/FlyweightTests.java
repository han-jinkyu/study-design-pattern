package com.designpattern.study.flyweight;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlyweightTests {

    private ExpressionFlyweightFactory factory;
    private int leftNumber, rightNumber;

    @Before
    public void setup() {
        leftNumber = 100;
        rightNumber = 20;
        factory = ExpressionFlyweightFactory.getInstance();
    }

    @Test
    public void should_BeSameExpressionFlyweight_When_SameOperand() {
        // given
        String operand = "+";
        ExpressionFlyweight given = factory.getExpressionFlyweight(operand);

        // when
        ExpressionFlyweight result = factory.getExpressionFlyweight(operand);

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_BeAddExpression_When_AddOperand() {
        // given
        String operand = "+";
        String given = String.format("%d%s%d", leftNumber, operand, rightNumber);

        // when
        ExpressionFlyweight flyweight = factory.getExpressionFlyweight(operand);
        String result = flyweight.operate();

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_BeSubtractExpression_When_SubtractOperand() {
        // given
        String operand = "-";
        String given = String.format("%d%s%d", leftNumber, operand, rightNumber);

        // when
        ExpressionFlyweight flyweight = factory.getExpressionFlyweight(operand);
        String result = flyweight.operate();

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_BeMultiplyExpression_When_MultiplyOperand() {
        // given
        String operand = "*";
        String given = String.format("%d%s%d", leftNumber, operand, rightNumber);

        // when
        ExpressionFlyweight flyweight = factory.getExpressionFlyweight(operand);
        String result = flyweight.operate();

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_BeDivideExpression_When_DivideOperand() {
        // given
        String operand = "/";
        String given = String.format("%d%s%d", leftNumber, operand, rightNumber);

        // when
        ExpressionFlyweight flyweight = factory.getExpressionFlyweight(operand);
        String result = flyweight.operate();

        // then
        assertEquals(given, result);
    }
}
