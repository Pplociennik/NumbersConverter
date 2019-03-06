package com.converter.numbers.GUI;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window(int width, int height, String title ){
        setSize(new Dimension(width, height));
        setTitle(title);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ControlPanel panel = new ControlPanel();
        add(panel);
        setVisible(true);
    }
}
