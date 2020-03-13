package com.designpattern.study.command.commands;

import com.designpattern.study.command.AbstractOperationCommand;
import com.designpattern.study.command.OperationCommandReceiver;

public class DivideOperationCommand extends AbstractOperationCommand {

    public DivideOperationCommand(OperationCommandReceiver receiver, int value) {
        super(receiver, value);
    }

    @Override
    public void execute() {
        receiver.divide(value);
    }
}
