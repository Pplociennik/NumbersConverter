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
    public byte[] toBinary() {
        return null;
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
