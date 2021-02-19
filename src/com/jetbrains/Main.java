package com.jetbrains;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // Design of the first layout.
        /*Convert convert = new Convert();
        convert.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        convert.setSize(350, 200);
        convert.setBounds(100, 100, 450, 300);
        convert.getContentPane().setLayout(null);
        convert.setResizable(false);
        convert.setVisible(true);
        */

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Convert window = new Convert();
                    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    window.setSize(350, 200);
                    window.setBounds(100, 100, 450, 300);
                    window.getContentPane().setLayout(null);
                    window.setResizable(false);
                    window.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
