package ru.alishev.springcource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Show must go on!";
    }

    @Override
    public List<String> getAllSongs() {
        return new ArrayList<String>(){{
            add("Show must go on");
            add("Bohemian Rhapsody");
            add("I want to break free");
        }};
    }

}
