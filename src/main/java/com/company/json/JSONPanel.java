package com.company.json;

import java.util.List;

public class JSONPanel {
    private String title;
    private int gridx;
    private int gridy;
    private int gridWidth;

    private List<JSONButton> buttons;

    public String getTitle() {
        return title;
    }

    public int getGridx() {
        return gridx;
    }

    public int getGridy() {
        return gridy;
    }

    public int getGridWidth() {
        return gridWidth;
    }

    public List<JSONButton> getButtons() {
        return buttons;
    }
}
