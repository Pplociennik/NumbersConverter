package com.converter.numbers.application;

import com.converter.numbers.GUI.ControlPanel;
import com.converter.numbers.GUI.Window;

public class ApplicationController {

    private ControlPanel panel;
    private Window window;

    public ApplicationController(ControlPanel panel, Window window) {
        this.panel = panel;
        this.window = window;
    }

    public void convert() {

    }

    private void clearConsole() {
        window.console.selectAll();
        window.console.replaceSelection("");
    }
}
