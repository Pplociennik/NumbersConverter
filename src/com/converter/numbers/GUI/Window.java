package com.converter.numbers.GUI;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window(int width, int height, String title) {
        setSize(new Dimension(width, height));
        setTitle(title);
        setResizable(false);
        //setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JList jList = new JList(new String[]{"Decimal", "Binary", "Octal", "Hexadecimal"});
        jList.setSelectedIndex(0);

        JScrollPane scrollPane = new JScrollPane(jList);

        ControlPanel panel = new ControlPanel();
        add(scrollPane, BorderLayout.LINE_START);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
}
