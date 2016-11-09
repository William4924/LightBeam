package com.company;

import javax.swing.*;
import java.awt.*;

public class LightBeamActivity {

    final static int WIDTH = 230;
    final static int HEIGHT = 59;

    static JTextArea screenDisplay = new JTextArea("", HEIGHT, WIDTH);

    public static void main(String[] args) {

        LightBeamGame.drawOuterWalls();
        setupGUI();
        screenDisplay.setText(LightBeamGame.mapText.toString());
    }

    public static void setupGUI() {

        JFrame frame = new JFrame("Light Beam");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.addKeyListener(new LightBeamKeyListener());
        panel.add(screenDisplay);
        panel.setBackground(Color.BLACK);

        frame.add(panel);
        frame.setBackground(Color.BLACK);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setSize(1400, 900);
        frame.setVisible(true);

        screenDisplay.setFont(new Font("monospaced", Font.BOLD, 10));
        screenDisplay.setBackground(Color.black);
        screenDisplay.setDisabledTextColor(Color.WHITE);

        panel.requestFocusInWindow();
    }
}