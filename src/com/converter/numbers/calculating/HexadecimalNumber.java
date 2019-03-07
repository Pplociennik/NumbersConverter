package com.converter.numbers.calculating;

public class HexadecimalNumber implements Number{

    public final ID type = ID.hexadecimal;
    private String value;

    public HexadecimalNumber(String value) {
        this.value = value;
    }

    @Override
    public String toDecimal() {
        return null;
    }

    @Override
    public String toBinary() {
        return null;
    }

    @Override
    public String toOctal() {
        return null;
    }

    @Override
    public String toHexadecimal() {
        return value;
    }

    @Override
    public String getValue() {
        return String.valueOf(value);
    }
}
