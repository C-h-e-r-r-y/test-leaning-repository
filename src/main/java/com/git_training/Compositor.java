package com.git_training;

public class Compositor {
    private String song;

    public String getSong () {
        return song;
    }

    public void setSong (String song) {
        this.song = song;
    }

    @Override
    public String toString () {
        return "Compositor\n "+ "\tsong is: "+ this.song;
    }
}
