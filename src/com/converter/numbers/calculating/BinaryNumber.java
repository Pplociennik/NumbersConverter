package com.converter.numbers.calculating;

public class BinaryNumber implements Number {

    public final NumberSystems type = NumberSystems.binary;
    private String value;

    public BinaryNumber(String value) {
        this.value = value;
    }

    @Override
    public String toDecimal(Number number) {
        return null;
    }

    @Override
    public String toBinary(Number number) {
        return value;
    }

    @Override
    public String toOctal(Number number) {
        return null;
    }

    @Override
    public String toHexadecimal(Number number) {
        return null;
    }
}

