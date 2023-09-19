package com.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private Music music;
    private String name;
    private int Volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int volume) {
        Volume = volume;
    }

    public MusicPlayer() {
    }
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void setMusic(Music music) {
        this.music = music;
    }
    public void play() {
        System.out.println("Playing: " + music.getSong()); /// change method to play arrayList
    }


    public void playList() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
