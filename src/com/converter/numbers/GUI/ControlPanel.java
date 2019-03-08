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

    public JLabel decResult;
    public JLabel binResult;
    public JLabel octResult;
    public JLabel hexResult;

    public ControlPanel(Window parent) {

        this.parent = parent;

        this.decResult = new JLabel("Decimal: ");
        decResult.setBounds(400, 30, 100, 20);

        this.binResult = new JLabel("Binary: ");
        binResult.setBounds(400, 70, 100, 20);

        this.octResult = new JLabel("Octal: ");
        octResult.setBounds(400, 110, 100, 20);

        this.hexResult = new JLabel("Hexadecimal: ");
        hexResult.setBounds(400, 150, 100, 20);

        setSize(new Dimension(Converter.WIDTH, Converter.HEIGHT));
        setLayout(null);

        input = new JTextField("Liczba");
        input.setBounds(150, 80, 100, 20);


        convertButton = new JButton("Konwertuj!");
        convertButton.setSize(new Dimension(100, 30));
        convertButton.setLocation(150, 100);

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.convert();
            }
        } );

        add(input);
        add(convertButton);
        add(decResult);
        add(binResult);
        add(octResult);
        add(hexResult);

        this.controller = new ApplicationController(this, this.parent);
    }
}
