package com.converter.numbers.application;

import com.converter.numbers.GUI.ControlPanel;
import com.converter.numbers.GUI.Window;
import com.converter.numbers.calculating.*;
import com.converter.numbers.calculating.Number;
import com.converter.numbers.exceptions.NoTypeException;

public class ApplicationController {

    private ControlPanel panel;
    private Window window;

    public ApplicationController(ControlPanel panel, Window window) {
        this.panel = panel;
        this.window = window;
    }

    public void convert() {

        Number number = createNumberObject(window.jList.getSelectedValue().toString(), panel.input.getText());
        clearConsole();

        String decResult = number.toDecimal();
        String binResult = number.toBinary();
        String octResult = number.toOctal();
        String hexResult = number.toHexadecimal();

        window.console.append("Utworzono obiekt: " + number + "\n\n");
        window.console.append("Wartość: " + number.getValue() + "\n\n");
        window.console.append("Wartość binarna: " + binResult + "\n\n");
        window.console.append("Wartość dziesiętna: " + decResult + "\n\n");
        window.console.append("Wartość ósemkowa: " + octResult + "\n\n");
        window.console.append("Wartość szesnastkowa: " + hexResult + "\n\n");

        panel.decResult.setText("Decimal: " + decResult);
        panel.binResult.setText("Binary: " + binResult);
        panel.octResult.setText("Octal: " + octResult);
        panel.hexResult.setText("Hexadecimal: " + hexResult);

    }

    private void clearConsole() {
        window.console.selectAll();
        window.console.replaceSelection("");
    }

    private Number createNumberObject(String type, String value) {

        try {
            switch (type) {
                case "Decimal":
                    return new DecimalNumber(Integer.valueOf(value));
                case "Binary":
                    return new BinaryNumber(value);
                case "Octal":
                    return new OctalNumber(Integer.valueOf(value));
                case "Hexadecimal":
                    return new HexadecimalNumber(value);
            }
        } catch (NumberFormatException | NullPointerException e) {
            throw new NoTypeException("Zły typ!");
        }
        return null;

    }
}
