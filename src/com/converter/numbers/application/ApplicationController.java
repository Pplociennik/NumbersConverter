package com.converter.numbers.application;

import com.converter.numbers.GUI.ControlPanel;
import com.converter.numbers.GUI.Window;
import com.converter.numbers.calculating.*;
import com.converter.numbers.calculating.Number;

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

        window.console.append("Utworzono obiekt: " + number + "\n\n");
        window.console.append("Wartość: " + number.getValue() + "\n\n");

    }

    private void clearConsole() {
        window.console.selectAll();
        window.console.replaceSelection("");
    }

    private Number createNumberObject(String type, String value) {

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
        return null;
    }
}
