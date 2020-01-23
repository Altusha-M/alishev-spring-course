package ru.alishev.springcource;

public class ClassicalMusic implements Music {
    private ClassicalMusic(){

    }

    public static ClassicalMusic getInstance(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Symphony";
    }

    @Override
    public void myInit(){
        System.out.println("doing my init");
    }

    @Override
    public void myDestroy(){
        System.out.println("doing my destroy");
    }
}
