package com.converter.numbers.GUI;

import com.converter.numbers.application.ApplicationController;
import com.converter.numbers.application.Converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControlPanel extends JPanel {

    private ApplicationController controller;
    private Window parent;

    public JTextField input;
    public JButton convertButton;

    public ControlPanel(Window parent) {

        this.parent = parent;

        setSize(new Dimension(Converter.WIDTH, Converter.HEIGHT));
        setLayout(null);

        input = new JTextField("Liczba");
        input.setBounds(200, 300, 100, 20);


        convertButton = new JButton("Konwertuj!");
        convertButton.setSize(new Dimension(100, 30));
        convertButton.setLocation(200, 400);

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.convert();
            }
        } );

        add(input);
        add(convertButton);

        this.controller = new ApplicationController(this, this.parent);
    }
}
