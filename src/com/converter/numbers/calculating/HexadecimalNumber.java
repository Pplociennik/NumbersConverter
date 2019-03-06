package com.converter.numbers.calculating;

public class HexadecimalNumber implements Number{

    public final NumberSystems type = NumberSystems.hexadecimal;
    private String value;

    public HexadecimalNumber(String value) {
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
        return null;
    }

    @Override
    public String toHexadecimal(Number number) {
        return value;
    }
}
