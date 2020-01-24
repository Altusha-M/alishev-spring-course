package ru.alishev.springcource;

import org.springframework.stereotype.Component;

@Component
public class Computer {

    private int id;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer){
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        musicPlayer.playMusic(Style.ROCK);
        return "id=" + id +
                ", musicPlayer=" + musicPlayer;
    }
}
