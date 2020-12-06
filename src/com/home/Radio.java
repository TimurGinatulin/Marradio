package com.home;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class Radio {
    public void Play(int n) {
        int act = n;
if (act == 1) {
    try {
        URL url = new URL("http://misato.ru-hoster.com:8000/stream");
        final JFXPanel jfxPanel = new JFXPanel();
        Media hit = new Media(url.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();} catch (MalformedURLException e) {
        e.printStackTrace();} catch (URISyntaxException e) {e.printStackTrace();}
return;}
    else    if ( act == 2) {
    try {
        URL url = new URL("http://misato.ru-hoster.com:8000/stream");
        final JFXPanel jfxPanel = new JFXPanel();
        Media hit = new Media(url.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.stop();} catch (MalformedURLException e) {
        e.printStackTrace();} catch (URISyntaxException e) {e.printStackTrace();}
    return;}
    if (act == 3){}
    }}

