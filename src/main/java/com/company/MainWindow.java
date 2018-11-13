package com.company;

import com.company.json.JSONPanel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.List;

public class MainWindow extends JFrame {
    public MainWindow(List<JSONPanel> panels) {
        setTitle("Dynamic GUI Test");

        this.setLayout(new GridBagLayout());

        panels.forEach(jsonpanel -> {
            JPanel panel = new JPanel();
            panel.setBorder(new TitledBorder(jsonpanel.title));
            this.add(panel, jsonpanel.getConstraints());

            panel.setLayout(new GridBagLayout());

            jsonpanel.buttons.forEach(jsonbutton -> {
                JButton button = new JButton(jsonbutton.label);
                panel.add(button, jsonbutton.getConstraints());
                button.addActionListener(e -> System.out.println("You pressed button " + jsonbutton.label +
                        " in panel " + jsonpanel.title));
            });
        });

        setSize(640, 480);
        setPreferredSize(getSize());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
