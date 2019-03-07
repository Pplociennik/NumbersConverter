package com.converter.numbers.calculating;

public class HexadecimalNumber implements Number{

    public final NumberSystems type = NumberSystems.hexadecimal;
    private String value;

    public HexadecimalNumber(String value) {
        this.value = value;
    }

    @Override
    public String toDecimal() {
        return null;
    }

    @Override
    public byte[] toBinary() {
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
}
