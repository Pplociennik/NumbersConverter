package com.converter.numbers.GUI;

import com.converter.numbers.application.ApplicationController;
import com.converter.numbers.application.Converter;

import javax.swing.*;
import java.awt.*;


public class ControlPanel extends JPanel {

    private ApplicationController controller;
    private Window parent;

    public ControlPanel(Window parent) {

        this.parent = parent;

        setSize(new Dimension(Converter.WIDTH, Converter.HEIGHT));
        setLayout(null);

        JTextField input = new JTextField("Liczba");
        input.setBounds(200, 300, 100, 20);


        JButton convertButton = new JButton("Konwertuj!");
        convertButton.setSize(new Dimension(100, 30));
        convertButton.setLocation(200, 400);

        add(input);
        add(convertButton);

        this.controller = new ApplicationController(this, this.parent);
    }
}
