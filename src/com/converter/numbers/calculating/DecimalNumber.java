package com.converter.numbers.calculating;

public class DecimalNumber implements Number {

    public final ID type = ID.decimal;
    private int value;

    public DecimalNumber(int value) {
        this.value = value;
    }

    @Override
    public String toDecimal() {
        return String.valueOf(value);
    }

    @Override
    public String toBinary() {

        CONSOLE.append("\n\n------------------------------------------------------------------------------------\n\n");
        CONSOLE.append("Obliczanie wartości binarnej: ");
        String binaryResult = "";

        while (value > 0) {
            binaryResult = binaryResult + (value % 2);
            value = value / 2;

            CONSOLE.append("\n\nWartość dziesiętna w danym stanie: " + value);
            CONSOLE.append("\n\nBudowa liczby binarnej: " + binaryResult + "\n\n");
        }
        CONSOLE.append("\n\n------------------------------------------------------------------------------------\n\n");

        return new StringBuilder(binaryResult).reverse().toString();
    }

    @Override
    public String toOctal() {
        return null;
    }

    @Override
    public String toHexadecimal() {
        return null;
    }

    @Override
    public String getValue() {
        return String.valueOf(value);
    }
}
