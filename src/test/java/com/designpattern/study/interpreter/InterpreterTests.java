package com.designpattern.study.interpreter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterpreterTests {

    @Test
    public void should_Be12_When_AddFunction_With_2_And_10() throws CalcParseException {
        // given
        double leftNumber = 2.0d;
        double rightNumber = 10.0d;
        double given = leftNumber + rightNumber;

        String text = String.format("ADD(%d,%d)", (int)leftNumber, (int)rightNumber);
        CalcContext context = new CalcContext(text);

        // when
        CalcToken token = context.next();
        AbstractExpression expression = CalcExpressionFactory.createExpression(token);

        double result = 0.0d;
        if (expression != null) {
            expression.parse(context);
            result = expression.operate();
        }

        // then
        assertEquals(given, result, 0.0);
    }
}
