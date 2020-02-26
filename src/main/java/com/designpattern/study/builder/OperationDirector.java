package com.designpattern.study.builder;

public class OperationDirector {

    private AbstractOperationBuilder builder;

    public OperationDirector(AbstractOperationBuilder builder) {
        this.builder = builder;
    }

    public String build() {
        builder.buildLeftNumber();
        builder.buildOperator();
        builder.buildRightNumber();
        builder.buildAnswer();

        return builder.getResult();
    }
}
