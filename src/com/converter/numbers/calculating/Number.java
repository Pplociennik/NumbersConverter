package com.converter.numbers.calculating;

import com.converter.numbers.GUI.Window;

import javax.swing.*;

public interface Number {

     final JTextArea CONSOLE = Window.console;

     String toDecimal();

     String toBinary();

     String toOctal();

     String toHexadecimal();

     String toString();

     String getValue();

}
