package com.designpattern.study.singleton;

public class OperationSingleton {

    public static final int ADD_OPERATION = 1;
    public static final int SUBTRACT_OPERATION = 2;
    public static final int MULTIPLY_OPERATION = 3;
    public static final int DIVIDE_OPERATION = 4;

    private static OperationSingleton operationSingleton = new OperationSingleton();

    private OperationSingleton() {
        super();
    }

    /**
     * 인스턴스를 취득한다
     * @return 싱글턴 인스턴스
     */
    public static OperationSingleton getInstance() {
        return operationSingleton;
    }

    /**
     * 계산한다
     * @param operationType 계산 종류
     * @param leftNumber 계산할 왼쪽값
     * @param rightNumber 계산할 오른쪽값
     * @return 계산 결과
     */
    public int operate(int operationType, int leftNumber, int rightNumber) throws Exception {
        int answer;

        switch (operationType) {
            case ADD_OPERATION:
                answer = leftNumber + rightNumber;
                break;

            case SUBTRACT_OPERATION:
                answer = leftNumber - rightNumber;
                break;

            case MULTIPLY_OPERATION:
                answer = leftNumber * rightNumber;
                break;

            case DIVIDE_OPERATION:
                answer = leftNumber / rightNumber;
                break;

            default:
                throw new Exception("등록되어 있지 않은 계산 타입입니다");
        }

        return answer;
    }
}
