package com.converter.numbers.GUI;

import com.converter.numbers.application.Converter;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public JList jList;
    public JScrollPane scrollPane;
    public static JTextArea console;
    public JScrollPane scrollConsole;
    public ControlPanel panel;

    public Window(int width, int height, String title) {
        setSize(new Dimension(width, height));
        setTitle(title);
        setResizable(false);
        //setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jList = new JList(new String[]{"Decimal", "Binary", "Octal", "Hexadecimal"});
        jList.setSelectedIndex(0);

        scrollPane = new JScrollPane(jList);

        console = new JTextArea(1, 25);
        //console.setLineWrap(true);
        console.append("Witaj w przeliczniku systemów liczbowych!\n\nZacznij działać!\n\n- > Wybierz system\n- > Wpisz liczbę w tym systemie\n- > Kliknij przycisk Konwertuj!\n\n< - > Gotowe! :)");
        console.setRows(15);
        console.setEditable(false);

        scrollConsole = new JScrollPane (console,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        panel = new ControlPanel(this);

        add(scrollPane, BorderLayout.WEST);
        add(panel, BorderLayout.CENTER);
        add(scrollConsole, BorderLayout.SOUTH);
        setVisible(true);
    }
}
