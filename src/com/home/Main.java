package com.home;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main  {
    public static void main(String[] args)  {
//Windows windows = new Windows();
//windows.Open();
//        JPanel panel = new JPanel();
//        panel.setLayout(new BorderLayout());
        JFrame jFrame = new JFrame();
        JFrame.setDefaultLookAndFeelDecorated(true);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(300,100);


        Radio radio = new Radio();
jFrame.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
int x = e.getX();
int y = e.getY();
if ( x > 0 && x < 150 && y > 0 && y < 100){

    radio.Play();
}
else {

    System.out.println("Close");}
        super.mouseClicked(e);
    }
});


        }}
