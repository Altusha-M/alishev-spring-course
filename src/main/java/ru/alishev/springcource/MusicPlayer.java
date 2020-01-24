package ru.alishev.springcource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Random;

enum Style {
    ROCK,
    CLASSICAL
}

@Component
public class MusicPlayer {

    @PostConstruct
    public void doInit(){
        System.out.println("doing init");
    }

    @Value("${musicPlayer.name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Value("${musicPlayer.volume}")
    private int value;

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
