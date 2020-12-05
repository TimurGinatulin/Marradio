package com.home;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.net.URL;

public class Radio {

    public void Play() {

        try {
      URL url = new URL("http://misato.ru-hoster.com:8000/stream");
    final JFXPanel jfxPanel = new JFXPanel();
    Media hit = new Media(url.toURI().toString());
    MediaPlayer mediaPlayer = new MediaPlayer(hit);
            mediaPlayer.play();} catch (Exception ex){ ex.printStackTrace();}
}}

