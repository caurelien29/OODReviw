package Problem2;

import java.util.ArrayList;

public abstract class Playlist {
    private String name;
    private ArrayList<Song> songs;

    // Creates a playlist with an empty song list
    public Playlist(String name) {
        this.name = name;
        songs = new ArrayList<>();
    }

    // Returns the playlist name
    public String getName() {
        return name;
    }

    // Returns the songs in the playlist
    public ArrayList<Song> getSongs() {
        return songs;
    }

    // Adds a song to the playlist
    public void addSong(Song song) {
        songs.add(song);
    }

    // Removes a song from the playlist
    public void removeSong(Song song) {
        songs.remove(song);
    }

    // Plays all songs in the playlist
    public abstract void playAllSongs();

    // Returns the playlist vibe
    public abstract String getVibe();
}