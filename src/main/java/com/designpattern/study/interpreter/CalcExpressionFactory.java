package com.designpattern.study.interpreter;

import com.designpattern.study.interpreter.expressions.AddOperationExpression;
import com.designpattern.study.interpreter.expressions.NumberExpression;

public class CalcExpressionFactory {

    public static final AbstractExpression createExpression(CalcToken token) {
        if (token == null) {
            return null;
        }

        if (token.getType() == CalcToken.NUMBER) {
            return new NumberExpression(Integer.parseInt(token.getToken()));
        }

        switch (token.getToken()) {
            case "ADD":
                return new AddOperationExpression();
        }

        return null;
    }
}
