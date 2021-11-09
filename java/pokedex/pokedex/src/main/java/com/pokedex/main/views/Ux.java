package com.pokedex.main.views;

import java.awt.Color;
import java.awt.Image;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.*;
import java.awt.event.*;

import java.io.IOException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.pokedex.main.models.Pokemon;
import com.pokedex.main.services.PokemonApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import javax.swing.AbstractButton;

import javax.imageio.ImageIO;

public class Ux {

    private static Ux instance;
    private static final int WIDTH_SCREEN = 600;
    private static final int HEIGTH_SCREEN = 600;
    private static final int HEIGHT_POKEMON_BUTTON = 52;
    private static final int MARGIN_POKEMON_BUTTON = 2;
    JPanel panelDetail;
    JPanel panelListPokemon;
    JFrame frame;
    JLabel imagePokemon;
    static int countButton = 0;
    

    public static Ux getInstance() {
        if (instance == null) {
            instance = new Ux();
        }
        return instance;
    }

    public Ux() {
        // Creando ventana
        frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(WIDTH_SCREEN, HEIGTH_SCREEN);

        // mostrar los datos del pokemon
        panelDetail = new JPanel();
        panelDetail.setSize(WIDTH_SCREEN / 2, HEIGTH_SCREEN / 2);
        panelDetail.setBackground(Color.blue);

        imagePokemon = new JLabel();
        imagePokemon.setVerticalAlignment(JLabel.BOTTOM);
        imagePokemon.setBounds(WIDTH_SCREEN / 2, 0, WIDTH_SCREEN / 2, HEIGTH_SCREEN / 2);

        imagePokemon.setOpaque(true);
        imagePokemon.setForeground(new Color(120, 90, 40));
        imagePokemon.setBackground(new Color(100, 20, 70));
        this.addImagePanel("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/45.png");

        panelListPokemon = new JPanel();
        panelListPokemon.setSize(WIDTH_SCREEN / 2, HEIGTH_SCREEN);
        panelListPokemon.setLayout(null);
        panelListPokemon.setPreferredSize(new Dimension(WIDTH_SCREEN / 2, 2 * HEIGTH_SCREEN));
        panelListPokemon.setBackground(Color.red);

        frame.getContentPane().add(panelListPokemon);
        frame.add(imagePokemon);
        frame.getContentPane().add(panelDetail);
        // frame.setVisible(true);

        // System.out.println(x);


    }

    public void addImagePanel(String path) {
        Image image = null;
        try {
            URL url = new URL(path);
            image = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image newimg = image.getScaledInstance(WIDTH_SCREEN / 2, HEIGTH_SCREEN / 2, java.awt.Image.SCALE_SMOOTH);
        imagePokemon.setIcon(new ImageIcon(newimg));
    }

    public void addButton(String namePokemon) {
        JButton pokemonButton = new JButton(namePokemon);
        pokemonButton.setBounds(0, (HEIGHT_POKEMON_BUTTON + MARGIN_POKEMON_BUTTON) * countButton, WIDTH_SCREEN / 2,
                HEIGHT_POKEMON_BUTTON);
        pokemonButton.setFont(new Font("Arial", Font.PLAIN, 22));
        panelListPokemon.add(pokemonButton);
        countButton = countButton + 1;

        pokemonButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String namePokemon = ((AbstractButton) e.getSource()).getText();
                System.out.println(namePokemon);

                // consulta del servicio
                PokemonApi api = new PokemonApi();
                Call<Pokemon> call = api.getPokemonById(namePokemon);

                call.enqueue(new Callback<Pokemon>() {

                    @Override
                    public void onResponse(Response<Pokemon> response) {
                        instance.addImagePanel(response.body().getSprites().getFront_default());
                    }

                    @Override
                    public void onFailure(Throwable t) {
                        System.out.println("Error :: " + t.getLocalizedMessage());
                    }

                });
            }
        });
    }

    public void refreshUX() {
        frame.setVisible(false);
        frame.setVisible(true);
    }
}
