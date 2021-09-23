package com.javeriana;

import javax.swing.*;
import javax.swing.plaf.ButtonUI;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;
import java.awt.Color.*;

public class App {
    static JTextField tf = new JTextField(10); 
    public static void main(String[] args) {

        // double var = 0;
        // double max = 12;
        // double min = 10;
        // String msg = "";
        // int select = 0;

        // int array[]; // Array -> Objeto
        // array = new int[10];
        // ArrayList<Integer> arrayDinamico = new ArrayList<Integer>(); // Vector
        // -Arreglo dinamico

        // for (int i = 0; i < array.length; i++){
        // array[i] = i;
        // // System.out.println("estatico: -> " + array[i]);
        // // System.out.println("estatico: size-> " + array.length);
        // arrayDinamico.add(i);
        // System.out.println("Dinamico: -> " + arrayDinamico.get(i));
        // System.out.println("Dinamico: size-> " + arrayDinamico.size());
        // }
        // System.out.println("*************************************");
        // arrayDinamico.add(2,98);
        // System.out.println("Dinamico: size-> " + arrayDinamico.size());

        // for (int i = 0; i < arrayDinamico.size(); i++){
        // System.out.println("Dinamico: -> " + arrayDinamico.get(i));

        // }

        // Creando ventana
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(400, 600);


        // // Creando MenuBar y agregando componentes
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("ARCHIVO");
        JMenu m2 = new JMenu("Ayuda");
        mb.add(m2);
        mb.add(m1);

        // menu1
        JMenuItem m11 = new JMenuItem("Abrir");
        JMenuItem m12 = new JMenuItem("Guardar como");
        JMenuItem m13 = new JMenuItem("Cerrar");
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);

        // menu2
        JMenuItem m21 = new JMenuItem("About");
        JMenuItem m22 = new JMenuItem("Settings");
        m2.add(m21);
        m2.add(m22);

        // Creando el panel en la parte inferior y agregando componentes
        JPanel panel = new JPanel(); // el panel no está visible en la salida
        JLabel label = new JLabel("Introducir texto");
    

        // acepta hasta 10 caracteres 
        tf.setBounds(0, 0, 800, 150);
        tf.setText("HOLA calculadora");

        JButton send = new JButton("Enviar");
        JButton reset = new JButton("Restablecer");
        
        // CREACION DEL BOTON 
        JButton b = new JButton("1");// creating instance of JButton
        b.setBounds(0, 150, 90, 100);
        b.setBackground(new Color(0xBE5959));

        JButton b2 = new JButton("2");// creating instance of JButton
        b2.setBounds(90, 150, 90, 100);


        JButton b3 = new JButton("3");// creating instance of JButton
        b3.setBounds(180, 150, 90, 100);

        // panel.add(send); // Componentes agregados usando Flow Layout
        // panel.add(reset); // Componentes agregados usando Flow Layout
        // panel.add(label);
        frame.add(tf);
        frame.add(b);
        frame.add(b2);
        frame.add(b3);

        System.out.println("button is: " + b.getText());

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               System.out.println("button is: " +  e.getID());
               String butSrcTxt = ((AbstractButton) e.getSource()).getText();
               System.out.println("key  is: " +  butSrcTxt);
               tf.setText("Adios calculadora");
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               System.out.println("button is: " +  e.getID());
            }
        });

        // Área de texto en el centro
        JTextArea ta = new JTextArea();

        // Agregar componentes al marco.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);

    }

    // static es accesble desde cualquier clase
    static int pow(int x, int y) {
        return (int) Math.pow((double) x, (double) y);
    }

    static double pow(double x, double y) {
        return Math.pow(x, y);
    }
}
