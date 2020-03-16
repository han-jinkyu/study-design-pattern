package com.designpattern.study.interpreter;

public class CalcToken {

    public static final int FUNCTION = 1;
    public static final int NUMBER = 2;
    public static final int DELIMITER = 3;
    public static final int VARIABLE = 4;

    private int type;
    private String token;

    public CalcToken(int type, String token) {
        this.type = type;
        this.token = token;
    }

    public int getType() {
        return type;
    }

    public String getToken() {
        return token;
    }

    @Override
    public String toString() {
        return String.format("%s %s", getDescription(), token);
    }

    private String getDescription() {
        switch (type) {
            case FUNCTION:
                return "FUNCTION";

            case NUMBER:
                return "NUMBER";

            case DELIMITER:
                return "DELIMITER";

            case VARIABLE:
                return "VARIABLE";

            default:
                return null;
        }
    }
}
