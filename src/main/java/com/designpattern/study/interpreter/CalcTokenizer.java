package com.designpattern.study.interpreter;

import java.util.*;

public class CalcTokenizer {

    public static final String INVALID_VARIABLE = "#REF!";
    private static Set<String> keywordSet = new HashSet<>(
        Arrays.asList("SQRT", "FRAC", "POW", "ADD", "SUB", "MUL", "DIV")
    );

    private List<CalcToken> tokenList = new ArrayList<>();
    private int currentIndex = 0;

    public CalcTokenizer(String text) {
        StringBuffer sb;

        char ch;
        for (int ti = 0; ti < text.length(); ti++) {
            ch = text.charAt(ti);

            if (isDelimiter(ch)) {
                if (!Character.isWhitespace(ch)) {
                    tokenList.add(new CalcToken(CalcToken.DELIMITER, "" + ch));
                }

                continue;
            }

            if (Character.isLetter(ch)) {
                sb = new StringBuffer();
                sb.append(ch);

                for (int ci = ti + 1; ci < text.length(); ci++) {
                    ch = text.charAt(ci);
                    ti = ci;
                    if (isDelimiter(ch)) {
                        ti -= 1;
                        break;
                    }
                    sb.append(ch);
                }

                String variable = sb.toString();
                if (isFunction(variable)) {
                    tokenList.add(new CalcToken(CalcToken.FUNCTION, variable));
                }
                else {
                    tokenList.add(new CalcToken(CalcToken.VARIABLE, variable));
                }
                continue;
            }

            if (Character.isDigit(ch)) {
                sb = new StringBuffer();
                sb.append(ch);

                for (int ci = ti + 1; ci < text.length(); ci++) {
                    ch = text.charAt(ci);
                    ti = ci;
                    if (isDelimiter(ch)) {
                        ti -= 1;
                        break;
                    }
                    sb.append(ch);
                }

                tokenList.add(new CalcToken(CalcToken.NUMBER, sb.toString()));
            }
        }
    }

    private boolean isFunction(String variable) {
        return keywordSet.contains(variable);
    }

    private boolean isDelimiter(char ch) {
        return "(),".indexOf(ch) != -1;
    }

    public boolean hasNext() {
        return currentIndex < tokenList.size();
    }

    public CalcToken next() {
        return tokenList.get(currentIndex++);
    }

    public CalcToken getCurrentToken() {
        return currentIndex < tokenList.size()
            ? tokenList.get(currentIndex) : null;
    }
}
