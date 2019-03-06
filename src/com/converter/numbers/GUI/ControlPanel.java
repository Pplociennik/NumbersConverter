package com.converter.numbers.GUI;

import com.converter.numbers.application.Converter;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {

    public ControlPanel() {
        setSize(new Dimension(Converter.WIDTH, Converter.HEIGHT));

        JTextField input = new JTextField("Liczba");
        input.setPreferredSize(new Dimension(20, 20));

        add(input);
    }
}
