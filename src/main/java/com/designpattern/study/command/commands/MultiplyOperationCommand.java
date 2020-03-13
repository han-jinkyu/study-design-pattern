package com.designpattern.study.command.commands;

import com.designpattern.study.command.AbstractOperationCommand;
import com.designpattern.study.command.OperationCommandReceiver;

public class MultiplyOperationCommand extends AbstractOperationCommand {

    public MultiplyOperationCommand(OperationCommandReceiver receiver, int value) {
        super(receiver, value);
    }

    @Override
    public void execute() {
        receiver.multiply(value);
    }
}
