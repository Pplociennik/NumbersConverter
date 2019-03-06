package com.converter.numbers.calculating;

public class BinaryNumber implements Number {

    public final NumberSystems type = NumberSystems.binary;
    private String value;

    public BinaryNumber(String value) {
        this.value = value;
    }

    @Override
    public String toDecimal() {
        return null;
    }

    @Override
    public String toBinary() {
        return value;
    }

    @Override
    public String toOctal() {
        return null;
    }

    @Override
    public String toHexadecimal() {
        return null;
    }
}

