package ru.alishev.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

enum Style {
    ROCK,
    CLASSICAL
}

@Component
public class MusicPlayer {

    private Music rockMusic;
    private Music classicalMusic;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("classicalMusic") Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public void playMusic(Style style){
        if (style == Style.ROCK) {
            Random r = new Random();
            List<String> rm = rockMusic.getAllSongs();
            System.out.println("Playing " + rm.get(r.nextInt(3)));
        } else {
            Random r = new Random();
            List<String> rm = classicalMusic.getAllSongs();
            System.out.println("Playing " + rm.get(r.nextInt(3)));
        }
    }

}
