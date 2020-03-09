package com.designpattern.study.facade;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorFacadeTests {

    private CalculatorFacade calculatorFacade;
    private int leftNumber, rightNumber;

    @Before
    public void setup() {
        this.calculatorFacade = new CalculatorFacade();
        this.leftNumber = 100;
        this.rightNumber = 20;
    }

    @Test
    public void should_Be120_When_AddExpression() {
        // given
        int given = leftNumber + rightNumber;

        // when
        String expression = String.format("%d+%d", leftNumber, rightNumber);

        // then
        int result = calculatorFacade.calculate(expression);
        assertEquals(given, result);
    }

    @Test
    public void should_Be80_When_SubtractExpression() {
        // given
        int given = leftNumber - rightNumber;

        // when
        String expression = String.format("%d-%d", leftNumber, rightNumber);

        // then
        int result = calculatorFacade.calculate(expression);
        assertEquals(given, result);
    }

    @Test
    public void should_Be2000_When_MultiplyExpression() {
        // given
        int given = leftNumber * rightNumber;

        // when
        String expression = String.format("%d*%d", leftNumber, rightNumber);

        // then
        int result = calculatorFacade.calculate(expression);
        assertEquals(given, result);
    }

    @Test
    public void should_Be5_When_DivideExpression() {
        // given
        int given = leftNumber / rightNumber;

        // when
        String expression = String.format("%d/%d", leftNumber, rightNumber);

        // then
        int result = calculatorFacade.calculate(expression);
        assertEquals(given, result);
    }
}
