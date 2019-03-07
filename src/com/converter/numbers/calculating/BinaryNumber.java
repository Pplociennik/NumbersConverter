package com.converter.numbers.calculating;

public class BinaryNumber implements Number {

    public final ID type = ID.binary;
    private byte[] value;

    public BinaryNumber(byte[] value) {
        this.value = value;
    }

    public BinaryNumber(String value) {
        this.value = value.getBytes();
    }

    @Override
    public String toDecimal() {
        return null;
    }

    @Override
    public String toBinary() {
        return String.valueOf(value);
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
        return new String(value);
    }
}

