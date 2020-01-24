package ru.alishev.springcource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music = context.getBean("classicalMusicBean", Music.class);

        System.out.println("11111111111");

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer.toString());


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName() + " " + musicPlayer.getValue());
        context.close();
    }
}
