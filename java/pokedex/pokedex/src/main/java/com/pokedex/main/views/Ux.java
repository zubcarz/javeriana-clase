package com.pokedex.main.views;

import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.imageio.ImageIO;

public class Ux {

    private static Ux instance;

    private static final int WIDTH_SCREEN = 600;
    private static final int HEIGTH_SCREEN = 600;
    JPanel panelDetail;
    JPanel panelPokemon;
    JFrame frame;
    JLabel imagePokemon;

    public Ux() {
        // Creando ventana
        frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(WIDTH_SCREEN, HEIGTH_SCREEN);

        // panel details
        panelDetail = new JPanel();
        panelDetail.setSize(WIDTH_SCREEN / 2, HEIGTH_SCREEN);
        panelDetail.setBackground(Color.blue);

        imagePokemon = new JLabel();
        imagePokemon.setVerticalAlignment(JLabel.BOTTOM);
        imagePokemon.setBounds(WIDTH_SCREEN/2, 0, WIDTH_SCREEN / 2, HEIGTH_SCREEN / 2);
        
        imagePokemon.setOpaque(true);
        imagePokemon.setForeground(new Color(120, 90, 40));
        imagePokemon.setBackground(new Color(100, 20, 70));
        // this.addImagePanel("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/45.png");
  
        // Panel pokemon
        panelPokemon = new JPanel();
        panelPokemon.setBackground(Color.red);
        panelPokemon.setSize(WIDTH_SCREEN / 2, HEIGTH_SCREEN);


        // panel Scroll
        JScrollPane scrollPane = new JScrollPane(panelPokemon);
        // scrollPane.setSize(WIDTH_SCREEN / 2, HEIGTH_SCREEN);

        JButton boton1=new JButton("Finalizar");
        boton1.setBounds(0,0,200,300);
        frame.add(scrollPane);

        frame.getContentPane().add(panelPokemon);
        // frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        frame.add(imagePokemon);
        frame.getContentPane().add(panelDetail);
        frame.setVisible(true);

    }

    public static Ux getInstance() {
        if (instance == null) {
            instance = new Ux();
        }
        return instance;
    }

    public void addImagePanel(String path) {
        Image image = null;
        try {
            URL url = new URL(path);
            image = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
  
        Image newimg = image.getScaledInstance(WIDTH_SCREEN / 2, HEIGTH_SCREEN / 2,  java.awt.Image.SCALE_SMOOTH);
        imagePokemon.setIcon( new ImageIcon(newimg));
    }

}
