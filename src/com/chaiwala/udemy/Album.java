package com.chaiwala.udemy;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private String name;
    private List<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public void addSong(Song newSong) {
        if (songs.contains(newSong)) {
            System.out.println("Album (" + name + ") already has this song");
            return;
        }

        songs.add(newSong);
        newSong.addAlbum(this);
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongs() {
        return songs;
    }
}
