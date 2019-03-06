package com.converter.numbers.calculating;

public class OctalNumber implements Number{

    public final NumberSystems type = NumberSystems.octal;
    private int value;

    public OctalNumber(int value) {
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
        return String.valueOf(value);
    }

    @Override
    public String toHexadecimal() {
        return null;
    }
}
