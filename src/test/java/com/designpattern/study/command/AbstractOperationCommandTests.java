package com.designpattern.study.command;

import com.designpattern.study.command.commands.AddOperationCommand;
import com.designpattern.study.command.commands.DivideOperationCommand;
import com.designpattern.study.command.commands.MultiplyOperationCommand;
import com.designpattern.study.command.commands.SubtractOperationCommand;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AbstractOperationCommandTests {

    private static OperationCommandReceiver receiver;

    @BeforeClass
    public static void setup() {
        receiver = new OperationCommandReceiver();
    }

    @Test
    public void test1_Should_Be20_When_Add20_WithAddOperationCommand() {
        // given
        int expected = 20;
        int operationNumber = 20;

        // when
        AddOperationCommand command = new AddOperationCommand(receiver, operationNumber);
        command.execute();

        // then
        int result = receiver.getResult();
        assertEquals(expected, result);
    }

    @Test
    public void test2_Should_Be10_When_Subtract10_WithSubtractOperationCommand_After_AddOperationCommand() {
        // given
        int expected = 10;
        int operationNumber = 10;

        // when
        SubtractOperationCommand command = new SubtractOperationCommand(receiver, operationNumber);
        command.execute();

        // then
        int result = receiver.getResult();
        assertEquals(expected, result);
    }

    @Test
    public void test3_Should_Be100_When_Multiply10_WithMultiplyOperationCommand_After_SubtractOperationCommand() {
        // given
        int expected = 100;
        int operationNumber = 10;

        // when
        MultiplyOperationCommand command = new MultiplyOperationCommand(receiver, operationNumber);
        command.execute();

        // then
        int result = receiver.getResult();
        assertEquals(expected, result);
    }

    @Test
    public void test4_Should_Be10_When_Divide10_WithDivideOperationCommand_After_MultiplyOperationCommand() {
        // given
        int expected = 10;
        int operationNumber = 10;

        // when
        DivideOperationCommand command = new DivideOperationCommand(receiver, operationNumber);
        command.execute();

        // then
        int result = receiver.getResult();
        assertEquals(expected, result);
    }
}
