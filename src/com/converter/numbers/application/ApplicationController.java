package com.converter.numbers.application;

public class ApplicationController {
    private static ApplicationController instance = null;

    public static ApplicationController getInstance() {
        if (instance == null)
            instance = new ApplicationController();

        return instance;
    }

    private ApplicationController() {
    }

    public void convert() {

    }
}
