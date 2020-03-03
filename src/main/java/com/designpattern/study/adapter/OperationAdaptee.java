package com.designpattern.study.adapter;

/**
 * 기존 클래스 역할
 * 나누기에서만 재사용하려고 한다
 */
public class OperationAdaptee {

    public static final int ADD_OPERATION = 1;
    public static final int SUBTRACT_OPERATION = 2;
    public static final int MULTIPLY_OPERATION = 3;
    public static final int DIVIDE_OPERATION = 4;

    public OperationAdaptee() {
    }

    public int calculate(int operationType, int leftNumber, int rightNumber) {
        switch (operationType) {
            case ADD_OPERATION:
                return leftNumber + rightNumber;

            case SUBTRACT_OPERATION:
                return leftNumber - rightNumber;

            case MULTIPLY_OPERATION:
                return leftNumber * rightNumber;

            case DIVIDE_OPERATION:
                return leftNumber / rightNumber;
        }

        return 0;
    }
}
