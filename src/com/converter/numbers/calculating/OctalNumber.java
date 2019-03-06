package com.converter.numbers.calculating;

public class OctalNumber implements Number{

    public final NumberSystems type = NumberSystems.octal;
    private int value;

    public OctalNumber(int value) {
        this.value = value;
    }

    @Override
    public String toDecimal(Number number) {
        return null;
    }

    @Override
    public String toBinary(Number number) {
        return null;
    }

    @Override
    public String toOctal(Number number) {
        return String.valueOf(value);
    }

    @Override
    public String toHexadecimal(Number number) {
        return null;
    }
}
