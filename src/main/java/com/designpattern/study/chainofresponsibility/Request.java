package com.designpattern.study.chainofresponsibility;

public final class Request {

    private String expression;

    public Request(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public int getLeftNumber(String operator) {
        int operatorIndex = expression.indexOf(operator);
        String leftNumberStr = expression.substring(0, operatorIndex);
        return Integer.parseInt(leftNumberStr);
    }

    public int getRightNumber(String operator) {
        int operatorIndex = expression.indexOf(operator);
        String rightNumberStr = expression.substring(operatorIndex + 1);
        return Integer.parseInt(rightNumberStr);
    }
}
