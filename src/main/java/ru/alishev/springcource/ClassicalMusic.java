package ru.alishev.springcource;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Symphony";
    }

    @Override
    public List<String> getAllSongs() {
        return new ArrayList<String>(){{
            add("Symphony 12");
            add("Symphony 121");
            add("Polka");
        }};
    }

}
