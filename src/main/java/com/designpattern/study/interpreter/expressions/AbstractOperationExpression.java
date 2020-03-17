package com.designpattern.study.interpreter.expressions;

import com.designpattern.study.interpreter.*;

import java.util.ArrayList;

public abstract class AbstractOperationExpression extends AbstractFunctionExpression {

    protected ArrayList<AbstractExpression> operandList = new ArrayList<>();

    public abstract double operate();

    public final void addOperandExpression(AbstractExpression operandExpression) {
        operandList.add(operandExpression);
    }

    @Override
    public void parse(CalcContext context) throws CalcParseException {
        // Function 넘기기
        context.skipToken(getFunctionName());

        // 괄호 넘기기
        context.next();
        context.skipToken("(");

        CalcToken currentToken = context.next();
        AbstractExpression operandExpression = CalcExpressionFactory.createExpression(currentToken);
        operandExpression.parse(context);
        addOperandExpression(operandExpression);

        // 콤마 넘기기
        context.next();
        context.skipToken(",");

        currentToken = context.next();
        operandExpression = CalcExpressionFactory.createExpression(currentToken);
        operandExpression.parse(context);
        addOperandExpression(operandExpression);

        // 괄호 넘기기
        context.next();
        context.skipToken(")");
    }
}
