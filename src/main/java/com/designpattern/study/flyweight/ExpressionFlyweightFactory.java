package com.designpattern.study.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExpressionFlyweightFactory {

    private Map<String, ExpressionFlyweight> pool = new HashMap<>();

    private static ExpressionFlyweightFactory instance = new ExpressionFlyweightFactory();

    private ExpressionFlyweightFactory() {
    }

    public static ExpressionFlyweightFactory getInstance() {
        return instance;
    }

    public ExpressionFlyweight getExpressionFlyweight(String operand) {
        ExpressionFlyweight flyweight = pool.getOrDefault(operand, null);
        if (flyweight == null) {
            flyweight = new ExpressionFlyweight(operand, 100, 20);
            pool.put(operand, flyweight);
        }
        return flyweight;
    }
}
