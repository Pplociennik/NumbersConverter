package com.converter.numbers.GUI;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public JList jList;
    public JScrollPane scrollPane;
    public JTextArea console;
    public JScrollPane scrollConsole;
    public ControlPanel panel;

    public Window(int width, int height, String title) {
        setSize(new Dimension(width, height));
        setTitle(title);
        setResizable(false);
        //setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jList = new JList(new String[]{"Decimal", "Binary", "Octal", "Hexadecimal"});
        jList.setSelectedIndex(0);

        scrollPane = new JScrollPane(jList);

        console = new JTextArea(1, 25);
        //console.setLineWrap(true);
        console.append("Witaj w przeliczniku systemów liczbowych!\n\nZacznij działać!\n\n- > Wybierz system\n- > Wpisz liczbę w tym systemie\n- > Kliknij przycisk Konwertuj!\n\n< - > Gotowe! :)");
        console.setEditable(false);

        scrollConsole = new JScrollPane (console,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        panel = new ControlPanel(this);

        add(scrollPane, BorderLayout.LINE_START);
        add(panel, BorderLayout.CENTER);
        add(scrollConsole, BorderLayout.LINE_END);
        setVisible(true);
    }
}
