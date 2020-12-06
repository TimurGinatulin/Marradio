package com.home;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class Windows extends JWindow {
    private static Image Skin;
    private int window_w = 300, window_h = 100;
    public Windows() {
        super();
        setLocation(200, 100);
        setSize (window_w, window_h);
        setVisible(true);


    }
public void Open() throws IOException {
        Skin = ImageIO.read(Windows.class.getResourceAsStream("Skin.bmp"));
    Windows windows = new Windows();
    Field field = new Field();
    windows.add(field);
    Radio radio = new Radio();


windows.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        int n =0;
        int x = e.getX();
        int y = e.getY();
        System.out.println(x+" " + y);
        if ( x >= 0 && x <= 100 && y >= 0 && y <= 100) {
            Radio radio = new Radio();
            radio.Play(1);
            System.out.println("mousePlay");
return;
        }
       else   if( x > 100 && x < 230 && y > 0 && y < 50){
            Radio radio = new Radio();
            radio.Play(2);
            System.out.println("mouseStop");
            return;
        }
        else if( x > 230 && x < 300 && y > 0 && y < 50){
             System.out.println("mouseout");
             return;
         }
        super.mouseClicked(e); }});

    }

    private static void repaint(Graphics g){
g.drawImage(Skin,0,0,null);

    }
    private static class Field extends JPanel{
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            Windows.repaint(g);
        }
    }
}
