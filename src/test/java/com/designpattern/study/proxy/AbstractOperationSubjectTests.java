package com.designpattern.study.proxy;

import com.designpattern.study.proxy.exception.OperationException;
import com.designpattern.study.proxy.subjects.AddOperationSubject;
import com.designpattern.study.proxy.subjects.DivideOperationSubject;
import com.designpattern.study.proxy.subjects.MultiplyOperationSubject;
import com.designpattern.study.proxy.subjects.SubtractOperationSubject;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbstractOperationSubjectTests {

    private int leftNumber, rightNumber;

    @Before
    public void setup() {
        leftNumber = 100;
        rightNumber = 20;
    }

    @Test
    public void should_Be120_When_AddOperationSubject() throws OperationException {
        // given
        int given = leftNumber + rightNumber;

        // when
        AbstractOperationSubject subject = new AddOperationSubject();
        int result = subject.operate(leftNumber, rightNumber);

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_Be80_When_SubtractOperationSubject() throws OperationException {
        // given
        int given = leftNumber - rightNumber;

        // when
        AbstractOperationSubject subject = new SubtractOperationSubject();
        int result = subject.operate(leftNumber, rightNumber);

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_Be2000_When_MultiplyOperationSubject() throws OperationException {
        // given
        int given = leftNumber * rightNumber;

        // when
        AbstractOperationSubject subject = new MultiplyOperationSubject();
        int result = subject.operate(leftNumber, rightNumber);

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_Be5_When_DivideOperationProxy() throws OperationException {
        // given
        int given = leftNumber / rightNumber;

        // when
        AbstractOperationSubject proxy = new DivideOperationProxy(new DivideOperationSubject());
        int result = proxy.operate(leftNumber, rightNumber);

        // then
        assertEquals(given, result);
    }

    @Test
    public void should_BeSame_When_DivideOperationProxy_And_DivideOperationSubject() throws OperationException {
        // when
        AbstractOperationSubject subject = new DivideOperationSubject();
        int subjectResult = subject.operate(leftNumber, rightNumber);

        AbstractOperationSubject proxy = new DivideOperationProxy(subject);
        int proxyResult = proxy.operate(leftNumber, rightNumber);

        // then
        assertEquals(subjectResult, proxyResult);
    }
}
