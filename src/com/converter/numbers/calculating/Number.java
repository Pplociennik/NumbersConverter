package com.converter.numbers.calculating;

import com.converter.numbers.GUI.Window;

import javax.swing.*;

public interface Number {

    final JTextArea CONSOLE = Window.console;

    public String toDecimal();

    public String toBinary();

    public String toOctal();

    public String toHexadecimal();

    public String toString();

    public String getValue();
}
