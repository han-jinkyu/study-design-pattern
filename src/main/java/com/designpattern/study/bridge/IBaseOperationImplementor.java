package com.designpattern.study.bridge;

public interface IBaseOperationImplementor {

    int add(int leftNumber, int rightNumber);

    int subtract(int leftNumber, int rightNumber);

    int multiply(int leftNumber, int rightNumber);

    int divide(int leftNumber, int rightNumber);
}
