package com.designpattern.study.builder;

import com.designpattern.study.builder.builders.AddOperationBuilder;
import com.designpattern.study.builder.builders.DivideOperationBuilder;
import com.designpattern.study.builder.builders.MultiplyOperationBuilder;
import com.designpattern.study.builder.builders.SubtractOperationBuilder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationDirectorTests {

    private OperationDirector director;
    private AbstractOperationBuilder builder;
    private int leftNumber, rightNumber;

    @Before
    public void setup() {
        this.leftNumber = 100;
        this.rightNumber = 20;
    }

    @Test
    public void should_BeAddOperator_When_UseAddOperationBuilder() {
        // given
        String given = String.format("%d + %d = %d", leftNumber, rightNumber, leftNumber + rightNumber);

        // when
        builder = new AddOperationBuilder(leftNumber, rightNumber);
        director = new OperationDirector(builder);
        String build = director.build();

        // then
        assertEquals(given, build);
    }

    @Test
    public void should_BeSubtractOperator_When_UseSubtractOperationBuilder() {
        // given
        String given = String.format("%d - %d = %d", leftNumber, rightNumber, leftNumber - rightNumber);

        // when
        builder = new SubtractOperationBuilder(leftNumber, rightNumber);
        director = new OperationDirector(builder);
        String build = director.build();

        // then
        assertEquals(given, build);
    }

    @Test
    public void should_BeMultiplyOperator_When_UseMultiplyOperationBuilder() {
        // given
        String given = String.format("%d * %d = %d", leftNumber, rightNumber, leftNumber * rightNumber);

        // when
        builder = new MultiplyOperationBuilder(leftNumber, rightNumber);
        director = new OperationDirector(builder);
        String build = director.build();

        // then
        assertEquals(given, build);
    }

    @Test
    public void should_BeDivideOperator_When_UseDivideOperationBuilder() {
        // given
        String given = String.format("%d / %d = %d", leftNumber, rightNumber, leftNumber / rightNumber);

        // when
        builder = new DivideOperationBuilder(leftNumber, rightNumber);
        director = new OperationDirector(builder);
        String build = director.build();

        // then
        assertEquals(given, build);
    }
}
