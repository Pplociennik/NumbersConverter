package com.converter.numbers.calculating;

public class DecimalNumber implements Number {

    public final NumberSystems type = NumberSystems.decimal;
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
}
