package com.converter.numbers.calculating;

public class BinaryNumber implements Number {

    public final NumberSystems type = NumberSystems.binary;
    private byte[] value;

    public BinaryNumber(byte[] value) {
        this.value = value;
    }

    @Override
    public String toDecimal() {
        return null;
    }

    @Override
    public byte[] toBinary() {
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

