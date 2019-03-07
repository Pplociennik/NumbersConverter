package com.converter.numbers.calculating;

public class BinaryNumber implements Number {

    public final ID type = ID.binary;
    private String value;

    public BinaryNumber(String value) {
        this.value = value;
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

