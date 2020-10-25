package com.chaiwala.udemy;

import java.util.ArrayList;
import java.util.List;

public class Song {

    private String title;
    private double duration;
    private List<Album> albums;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
        this.albums = new ArrayList<Album>();
    }

    public boolean listedInAlbum() {
        return !albums.isEmpty();
    }

    public void addAlbum(Album newAlbum) {
        albums.add(newAlbum);
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public List<Album> getAlbumList() {
        return albums;
    }
}
