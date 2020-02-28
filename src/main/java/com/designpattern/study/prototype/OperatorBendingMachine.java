package com.designpattern.study.prototype;

import com.designpattern.study.prototype.prototypes.AddOperationPrototype;
import com.designpattern.study.prototype.prototypes.DivideOperationPrototype;
import com.designpattern.study.prototype.prototypes.MultiplyOperationPrototype;
import com.designpattern.study.prototype.prototypes.SubtractOperationPrototype;

import java.util.HashMap;
import java.util.Optional;

public class OperatorBendingMachine {

    private AbstractOperationPrototype operationPrototype;

    private HashMap<String, AbstractOperationPrototype> operationPrototypeMap;

    public OperatorBendingMachine() {
        initiateOperationPrototypeMap();
    }

    private void initiateOperationPrototypeMap() {
        operationPrototypeMap = new HashMap<>();

        operationPrototypeMap.put("+", new AddOperationPrototype());
        operationPrototypeMap.put("-", new SubtractOperationPrototype());
        operationPrototypeMap.put("*", new MultiplyOperationPrototype());
        operationPrototypeMap.put("/", new DivideOperationPrototype());
    }

    public AbstractOperationPrototype getOperationClone(String operator) {
        AbstractOperationPrototype operation = operationPrototypeMap.get(operator);
        return operation.getClone();
    }
}
