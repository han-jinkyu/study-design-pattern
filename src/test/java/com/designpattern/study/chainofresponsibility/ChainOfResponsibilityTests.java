package com.designpattern.study.chainofresponsibility;

import com.designpattern.study.chainofresponsibility.handlers.AddOperationHandler;
import com.designpattern.study.chainofresponsibility.handlers.DivideOperationHandler;
import com.designpattern.study.chainofresponsibility.handlers.MultiplyOperationHandler;
import com.designpattern.study.chainofresponsibility.handlers.SubtractOperationHandler;
import com.sun.tools.javac.util.List;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChainOfResponsibilityTests {

    private int leftNumber, rightNumber;

    @Before
    public void setup() {
        leftNumber = 100;
        rightNumber = 20;
    }

    @Test
    public void should_BeSame_When_DoOperations() {
        // given
        AbstractOperationHandler handler = new AddOperationHandler("+");

        handler.setNext(new SubtractOperationHandler("-"))
            .setNext(new MultiplyOperationHandler("*"))
            .setNext(new DivideOperationHandler("/"));

        List<Integer> answers = List.of(
            leftNumber + rightNumber,
            leftNumber - rightNumber,
            leftNumber * rightNumber,
            leftNumber / rightNumber
        );

        // when
        List<Request> requests = List.of("+", "-", "*", "/")
            .map(op -> {
                String expression = String.format("%d%s%d", leftNumber, op, rightNumber);
                return new Request(expression);
            });

        // then
        for (int idx = 0; idx < requests.length(); idx++) {
            int answer = handler.handleRequest(requests.get(idx));
            int given = answers.get(idx);
            assertEquals(given, answer);
        }
    }
}
