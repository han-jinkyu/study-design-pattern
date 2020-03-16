package com.designpattern.study.interpreter;

public class CalcContext {

    private CalcTokenizer tokenizer;
    private CalcToken currentToken;

    public CalcContext(String text) {
        tokenizer = new CalcTokenizer(text);
    }

    public CalcToken next() {
        currentToken = tokenizer.hasNext() ? tokenizer.next() : null;
        return currentToken;
    }

    public void skipToken(String token) throws CalcParseException {
        if (!token.equals(currentToken.getToken())) {
            String message = String.format(
                "Warning: %s is expected, but %s is found",
                token, currentToken.toString());
            throw new CalcParseException(message);
        }
    }
}
