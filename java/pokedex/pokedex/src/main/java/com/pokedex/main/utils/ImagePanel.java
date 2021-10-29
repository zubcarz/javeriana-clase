package com.pokedex.main.utils;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
public class ImagePanel extends JPanel{
    private BufferedImage image;

    public ImagePanel(String path) {
       try {                
            URL url = new URL(path);
            image = ImageIO.read(url);
        //   image = ImageIO.read(new File("image name and path"));
       } catch (IOException ex) {
            // handle exception...
       }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);  
    }  
}