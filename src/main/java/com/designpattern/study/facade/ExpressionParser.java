package com.designpattern.study.facade;

public class ExpressionParser {

    private final String[] operators = { "+", "-", "*", "/" };

    private String operatorToken;
    private String leftNumberToken;
    private String rightNumberToken;

    public ExpressionParser() {
    }

    public String getOperatorToken() {
        return operatorToken;
    }

    public String getLeftNumberToken() {
        return leftNumberToken;
    }

    public String getRightNumberToken() {
        return rightNumberToken;
    }

    public void parse(String expression) {
        int idx = -1;

        for (int i = 0; i < operators.length; i++) {
            idx = expression.indexOf(operators[i]);
            if (idx == -1) continue;

            this.operatorToken = operators[i];
            break;
        }

        leftNumberToken = expression.substring(0, idx);
        rightNumberToken = expression.substring(idx + 1);
    }
}
