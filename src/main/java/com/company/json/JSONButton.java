package com.company.json;

import java.awt.*;

public class JSONButton {
    public String label;
    public String image;
    public Integer gridx = 0;
    public Integer gridy = 0;
    public Integer gridwidth = 1;
    public Integer gridheight = 1;
    public Integer ipadx = 0;
    public Integer ipady = 0;
    public Integer weightx = 0;
    public Integer weighty = 0;

    public GridBagConstraints getConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = this.gridx;
        gbc.gridy = this.gridy;
        gbc.gridwidth = this.gridwidth;
        gbc.gridheight = this.gridheight;
        gbc.ipadx = this.ipadx;
        gbc.ipady = this.ipady;
        gbc.weightx = this.weightx;
        gbc.weighty = this.weighty;
        return gbc;
    }
}
