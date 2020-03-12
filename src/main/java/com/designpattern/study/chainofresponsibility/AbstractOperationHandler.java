package com.designpattern.study.chainofresponsibility;

public abstract class AbstractOperationHandler {

    private String operator;
    private AbstractOperationHandler next;

    public AbstractOperationHandler(String operator) {
        this.operator = operator;
    }

    public AbstractOperationHandler setNext(AbstractOperationHandler next) {
        this.next = next;
        return next;
    }

    public final int handleRequest(Request request) {
        if (resolve(request)) {
            return operate(request);
        }
        else if (next != null) {
            return next.handleRequest(request);
        }
        else {
            handleFail(request);
            return 0;
        }
    }

    private void handleFail(Request request) {
        System.out.println("fail");
    }

    private boolean resolve(Request request) {
        return request.getExpression().contains(operator);
    }

    public String getOperator() {
        return operator;
    }

    protected abstract int operate(Request request);
}
