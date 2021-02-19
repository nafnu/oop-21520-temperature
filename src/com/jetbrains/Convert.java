package com.jetbrains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Convert extends JFrame {

    private JLabel title;

    private JTextField inputTemp;
    private JTextField result;

    private JRadioButton celsiusButton;
    private JRadioButton fahrenheitButton;

    private ButtonGroup radioGroup;

    private JButton convertButton;

    public Convert() {
        super("Convertor");
        setLayout(new FlowLayout());


        //Design of the title
        title = new JLabel("Temperature conversion", SwingConstants.CENTER);
        title.setBounds(0, 0, 460, 47);
        title.setBackground(new Color(107, 142, 35));
        title.setForeground(new Color(255, 250, 224));
        title.setFont(new Font("Serif", Font.ITALIC + Font.BOLD, 20));
        title.setOpaque(true);
        add(title);

        //Design of the input Temperature
        inputTemp = new JTextField();
        inputTemp.setFont(new Font("Serif", Font.PLAIN, 12));
        inputTemp.setColumns(10);
        inputTemp.setBounds(119, 111, 80, 20);
        add(inputTemp);

        //Create radio buttons
        celsiusButton = new JRadioButton("Celsius");
        celsiusButton.setFont(new Font("Serif", Font.BOLD, 12));
        celsiusButton.setBounds(119, 55, 82, 38);
        celsiusButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(celsiusButton);
        fahrenheitButton = new JRadioButton("Fahrenheit ");
        fahrenheitButton.setFont(new Font("Serif", Font.BOLD, 12));
        fahrenheitButton.setBounds(205, 64, 135, 21);
        fahrenheitButton.setHorizontalAlignment(SwingConstants.CENTER);
        add(fahrenheitButton);


        //Logical relationship between JRadioButtons
        radioGroup = new ButtonGroup();
        radioGroup.add(celsiusButton);
        radioGroup.add(fahrenheitButton);


        //Design of the output Result
        result = new JTextField();
        result.setFont(new Font("Serif", Font.BOLD, 12));
        result.setColumns(10);
        result.setBounds(119, 190, 80, 20);
        add(result);

        //Create the button
        convertButton = new JButton("Convert");
        convertButton.setFont(new Font("Serif", Font.BOLD, 12));
        convertButton.setBounds(157, 146, 128, 21);
        add(convertButton);

        //register the events for the Button
        convertButton.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent event) {

                        try {
                            if (celsiusButton.isSelected()) {
                                Double a = Double.parseDouble(inputTemp.getText());
                                Double resultValue = (a * 1.8000) + 32.00;
                                result.setText(resultValue + " °F");
                            } else {
                                Double a = Double.parseDouble(inputTemp.getText());
                                Double resultValue = (a - 32) / 1.8000;
                                result.setText(resultValue + " °C");
                            }

                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Please, enter a valid number!", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                        }

                    }
                }
        );
    }

}

