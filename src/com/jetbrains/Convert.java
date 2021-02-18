package com.jetbrains;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class Convert {

    private JFrame frame;
    private JTextField inputTemperature;
    private JTextField result;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Convert window = new Convert();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Convert() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setType(Type.UTILITY);
        frame.setBounds(100, 100, 450, 300);
        frame.setSize(450,300);
        frame.setTitle("Convertor App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.getContentPane().setLayout(null);

        JLabel label = new JLabel("Temperature Convertor");
        label.setBounds(0, 0, 460, 47);
        label.setBackground(new Color(107, 142, 35));
        label.setForeground(new Color(255, 250, 224));
        label.setFont(new Font("Serif", Font.BOLD, 20));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setOpaque(true);
        frame.getContentPane().add(label);

        ButtonGroup group = new ButtonGroup();
        JRadioButton celsiusButton = new JRadioButton("Celsius");
        celsiusButton.setFont(new Font("Serif", Font.BOLD, 12));
        celsiusButton.setBounds(119, 55, 82, 38);
        celsiusButton.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(celsiusButton);
        group.add(celsiusButton);

        JRadioButton fahrenheitButton = new JRadioButton("Fahrenheit ");
        fahrenheitButton.setFont(new Font("Serif", Font.BOLD, 12));
        fahrenheitButton.setBounds(205, 64, 135, 21);
        fahrenheitButton.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(fahrenheitButton);
        group.add(fahrenheitButton);

        inputTemperature = new JTextField();
        inputTemperature.setFont(new Font("Serif", Font.PLAIN, 12));
        inputTemperature.setBounds(119, 111, 208, 19);
        frame.getContentPane().add(inputTemperature);
        inputTemperature.setColumns(10);

        result = new JTextField();
        result.setFont(new Font("Serif", Font.PLAIN, 12));
        result.setBounds(119, 190, 208, 19);
        frame.getContentPane().add(result);
        result.setColumns(10);

        JButton convertButton = new JButton("Convert");
        convertButton.setFont(new Font("Serif", Font.BOLD, 12));
        convertButton.setBounds(157, 146, 128, 21);
        frame.getContentPane().add(convertButton);

        convertButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                try {
                    if (celsiusButton.isSelected()) {
                        Double a = Double.parseDouble(inputTemperature.getText());
                        Double resultValue = (a * 1.8000) + 32.00;
                        result.setText(resultValue + " °F");
                    } else {
                        Double a = Double.parseDouble(inputTemperature.getText());
                        Double resultValue = (a - 32) / 1.8000;
                        result.setText(resultValue + " °C");
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(frame, "Please, enter a valid number!");
                }
            }
        });
    }
}
