package com.javeriana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App {
    static JTextField bannnerCalculadora = new JTextField(10);
    static int widthScreen = 400; // px
    static int heightScren = 700; // px
    static int bWidth = 90; // px
    static  int bHeight = 100;// px

    public static void main(String[] args) {

        // Creando ventana
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(widthScreen, heightScren);

        // Creando el panel en la parte inferior y agregando componentes
        JPanel panel = new JPanel(); // el panel no está visible en la salida
        // acepta hasta 10 caracteres
        // Definir Fuente
        int margen = 20;
        Font sansFont = new Font("SansSerif", Font.BOLD, 48);
        bannnerCalculadora.setBounds(margen / 4, 0, widthScreen - margen, 150);
        bannnerCalculadora.setText("0");
        bannnerCalculadora.setFont(sansFont);
        bannnerCalculadora.setHorizontalAlignment(JTextField.RIGHT);
        bannnerCalculadora.setEditable(false);

        // CREACION DEL BOTON
        JButton b1 = new JButton("1");// creating instance of JButton
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");

        // Panel Vertical
        JButton bAdd = new JButton("+");
        bAdd.setBounds(270, 150, bWidth, bHeight);
        frame.add(bAdd);
        JButton bRes = new JButton("-");
        bRes.setBounds(270, 250, bWidth, bHeight);
        frame.add(bRes);
        JButton bPer = new JButton("X");
        bPer.setBounds(270, 350, bWidth, bHeight);
        frame.add(bPer);
        JButton bDiv = new JButton("/");
        bDiv.setBounds(270, 450, bWidth, bHeight);
        frame.add(bDiv);

        // Panel Horizontal
        JButton bDelete = new JButton("+");
        // Image img = ImageIO.read(getClass().getResource("resources/water.bmp"));
        // button.setIcon(new ImageIcon(img));
        JButton bClear = new JButton("+");
        JButton bMod = new JButton("+");

        JButton[] arrayButtons = new JButton[] { b1, b2, b3, b4, b5, b6, b7, b8, b9, b0 };

        int x, y;
        int x0 = 0;
        int y0 = 250;

        for (int i = 0; i < arrayButtons.length; i++) {
            x = x0 + 90 * (i % 3);
            int ymult = 0;
            if (i > 2)
                ymult = 1;
            if (i > 5)
                ymult = 2;

            y = y0 + 100 * ymult;
            if (i == arrayButtons.length - 1) {
                settingButton(arrayButtons[i], frame, 90, 450);
            } else {
                settingButton(arrayButtons[i], frame, x, y);
            }
        }

        frame.add(bannnerCalculadora);

        // Área de texto en el centro
        JTextArea ta = new JTextArea();
        // Agregar componentes al marco.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        // frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);

        // Logica

        Calculator calculadora = new Calculator();
        calculadora.setCurrentNumber(10);
        calculadora.add();
        calculadora.setCurrentNumber(34);
        calculadora.add();
        calculadora.setCurrentNumber(4);
        calculadora.add();
    }

    static void pressButton(ActionEvent e) {
        String textButton = ((AbstractButton) e.getSource()).getText();
        bannnerCalculadora.setText(  bannnerCalculadora.getText() + textButton);
    }

    static void settingButton(JButton button, JFrame f, int xPosition, int yPosition) {

        button.setBounds(xPosition, yPosition, bWidth, bHeight);
        button.setBackground(new Color(0xBE5959));
        f.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pressButton(e);
            }
        });
    }
}
