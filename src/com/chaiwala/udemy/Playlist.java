package com.chaiwala.udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Playlist {

    private String name;
    private List<Song> songs;
    private ListIterator<Song> nowPlaying;
    private boolean iteratingForward;

    public Playlist(String name) {
        this.name = name;
        songs = new ArrayList<>();
        System.out.println("New Playlist created: " + name);
    }

    public void addSong(Song newSong) {
        if (songs.contains(newSong)) {
            System.out.println("Playlist (" + name + ") already has this song");
            return;
        }

        if (!newSong.listedInAlbum()) {
            System.out.println("Song must be listed in at least 1 album.");
        }

        songs.add(newSong);
    }

    public void listSongs(boolean includeAlbumInfo) {
        int counter = 0;
        for(Song s : songs) {
            System.out.println(counter++ + ". " + s.getTitle() + " (duration: " + s.getDuration() + ")");
            if (includeAlbumInfo) {
                List<Album> albumList = s.getAlbumList();
                System.out.println("\tAlbums listed: " + albumList.size());
                System.out.print("\tAlbum names: ");
                for (Album a : albumList) {
                    System.out.print(a.getName() + " - ");
                }
                System.out.println();
            }

        }
    }

    public Song playSongs() {
        if (songs.size() > 0) {
            nowPlaying = songs.listIterator();
            iteratingForward = true;
            return nowPlaying.next();
        }

        System.out.println("Playlist has no songs.");
        return null;
    }

    public Song skipForward() {
        if (nowPlaying == null) {
            return playSongs();
        }

        if (!iteratingForward) {
            if (nowPlaying.hasNext()) {
                nowPlaying.next();
            }
            iteratingForward = true;
        }

        if (nowPlaying.hasNext()) {
            return nowPlaying.next();
        } else {
            System.out.println("Currently playing the last song in the playlist. No next song available.");
            iteratingForward = false;
            return nowPlaying.previous();
        }
    }

    public Song skipBack() {
        if (nowPlaying == null) {
            return playSongs();
        }

        if (iteratingForward) {
            if (nowPlaying.hasPrevious()) {
                nowPlaying.previous();
            }

            iteratingForward = false;
        }

        if (nowPlaying.hasPrevious()) {
            return nowPlaying.previous();
        } else {
            System.out.println("Currently playing the first song in the playlist. No previous song available.");
            iteratingForward = true;
            return nowPlaying.next();
        }
    }

    public Song repeatLastSong() {
        return nowPlaying.previous();
    }
}
