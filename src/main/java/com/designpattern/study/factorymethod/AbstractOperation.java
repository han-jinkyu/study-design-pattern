package com.designpattern.study.factorymethod;

/**
 * Factory 추상 클래스 역할
 */
public abstract class AbstractOperation {

    private int leftNumber, rightNumber;

    /**
     * 팩토리 메서드로써 Operator를 생성한다
     * @return Operator 객체
     */
    protected abstract AbstractOperator getOperator();

    public final String operate() {
        AbstractOperator operator = getOperator();
        String description = operator.getDescription();
        int answer = operator.getAnswer(leftNumber, rightNumber);
        return String.format("%d%s%d = %d", leftNumber, description, rightNumber, answer);
    }

    public void setLeftNumber(int leftNumber) {
        this.leftNumber = leftNumber;
    }

    public void setRightNumber(int rightNumber) {
        this.rightNumber = rightNumber;
    }
}
