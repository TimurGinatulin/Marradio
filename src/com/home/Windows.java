package com.home;
import javax.swing.*;
public class Windows extends JWindow {
    private int window_w = 300, window_h = 100;
    public Windows() {
        super();
        setLocation(200, 100);
        setSize (window_w, window_h);
        setVisible(true);
    }
public void Open(){
        new Windows();
}
}
