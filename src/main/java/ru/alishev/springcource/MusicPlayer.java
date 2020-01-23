package ru.alishev.springcource;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicAlbum;

    private String name;

    private int volume;

    public MusicPlayer() {
    }

    public void setMusicAlbum(List<Music> musicAlbum) {
        this.musicAlbum = musicAlbum;
    }

    public MusicPlayer(List<Music> musicAlbum) {
        this.musicAlbum = musicAlbum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic(){
        musicAlbum.stream()
                .map(s -> "Playing now: " + s.getSong())
                .forEach(System.out::println);
    }
}
