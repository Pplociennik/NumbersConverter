package com.converter.numbers.GUI;

import com.converter.numbers.application.Converter;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {

    public ControlPanel() {
        setSize(new Dimension(Converter.WIDTH, Converter.HEIGHT));
        setLayout(null);

        JTextField input = new JTextField("Liczba");
        input.setBounds(200, 300, 100, 20);


        JButton convertButton = new JButton("Konwertuj!");
        convertButton.setSize(new Dimension(100, 30));
        convertButton.setLocation(200, 400);

        add(input);
        add(convertButton);
    }
}
