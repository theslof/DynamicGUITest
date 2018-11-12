package com.company;

import com.company.json.JSONPanel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.List;

public class MainWindow extends JFrame {
    public MainWindow(List<JSONPanel> panels) {
        setTitle("Dynamic GUI Test");

        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;

        panels.forEach(jsonpanel -> {
            JPanel panel = new JPanel();
            panel.setBorder(new TitledBorder(jsonpanel.getTitle()));
            gbc.gridx = jsonpanel.getGridx();
            gbc.gridy = jsonpanel.getGridy();
            gbc.gridwidth = jsonpanel.getGridWidth();
            this.add(panel, gbc);

            GridBagLayout panellayout = new GridBagLayout();
            panel.setLayout(panellayout);
            GridBagConstraints panelgbc = new GridBagConstraints();
            panelgbc.fill = GridBagConstraints.BOTH;
            panelgbc.weightx = 1;
            panelgbc.weighty = 1;

            jsonpanel.getButtons().forEach(jsonbutton -> {
                JButton button = new JButton(jsonbutton.getLabel());
                panelgbc.gridx = jsonbutton.getGridx();
                panelgbc.gridy = jsonbutton.getGridy();
                panelgbc.gridwidth = jsonbutton.getGridWidth();
                panel.add(button, panelgbc);
                button.addActionListener(e -> {
                    System.out.println("You pressed button " + jsonbutton.getLabel() + " in panel " + jsonpanel.getTitle());
                });
            });
        });

        setSize(640, 480);
        setPreferredSize(getSize());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
