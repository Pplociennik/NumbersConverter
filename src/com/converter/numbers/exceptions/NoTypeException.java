package com.converter.numbers.exceptions;

import com.converter.numbers.calculating.Number;

public class NoTypeException extends NumberFormatException {

    public NoTypeException() {
    }

    public NoTypeException(String s) {
        super(s);
        Number.CONSOLE.selectAll();
        Number.CONSOLE.replaceSelection("");

        Number.CONSOLE.append("\n\n" + super.toString());
        Number.CONSOLE.append("\n\n" + super.getStackTrace());
    }
}
