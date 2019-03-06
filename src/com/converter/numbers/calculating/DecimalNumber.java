package com.converter.numbers.calculating;

public class DecimalNumber implements Number {

    public final NumberSystems type = NumberSystems.decimal;
    private int value;

    public DecimalNumber(int value) {
        this.value = value;
    }

    @Override
    public String toDecimal(Number number) {
        return String.valueOf(value);
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
        return null;
    }
}
