package com.converter.numbers.calculating;

import com.converter.numbers.exceptions.NoTypeException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryNumber implements Number {

    public final ID type = ID.binary;
    private String value;

    private Pattern pattern = Pattern.compile("[0-1]*");
    private Matcher matcher;

    public BinaryNumber(String value) {
        matcher = pattern.matcher(value);

        if (matcher.matches())
            this.value = value;
        else
            throw new NoTypeException("Zły typ!");
    }

    @Override
    public String toDecimal() {
        CONSOLE.append("\n\n------------------------------------------------------------------------------------\n\n");
        CONSOLE.append("Obliczanie wartości dziesiętnej: ");

        int max = this.value.length() - 1;
        int decimalResult = 0;
        int index = 0;
        String binary = this.value;

        while (max >= 0) {
            decimalResult += Integer.parseInt(binary.substring(index, index + 1)) * Math.pow(2, max);
            index++;
            max--;
            CONSOLE.append("\n\nKrok: " + index + "\n\nWynik: " + decimalResult);
        }
        CONSOLE.append("\n\n------------------------------------------------------------------------------------\n\n");

        return String.valueOf(decimalResult);
    }

    @Override
    public String toBinary() {
        return String.valueOf(value);
    }

    @Override
    public String toOctal() {
        CONSOLE.append("\n\n------------------------------------------------------------------------------------\n\n");
        CONSOLE.append("Obliczanie wartości ósemkowej: ");

        int max = this.value.length() - 1;
        int octalResult = 0;
        int index = 0;
        String binary = this.value;

        while (max >= 0) {
            octalResult += Integer.parseInt(binary.substring(index, index + 1)) * Math.pow(8, max);
            index++;
            max--;
            CONSOLE.append("\n\nKrok: " + index + "\n\nWynik: " + octalResult);
        }
        CONSOLE.append("\n\n------------------------------------------------------------------------------------\n\n");

        return String.valueOf(octalResult);
    }

    @Override
    public String toHexadecimal() {
        return null;
    }

    @Override
    public String getValue() {
        return new String(value);
    }
}

