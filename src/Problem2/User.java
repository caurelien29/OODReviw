package Problem2;

import java.util.ArrayList;

public class User {
    private String username;
    private ArrayList<Playlist> playlists;

    // Creates a user with an empty playlist list
    public User(String username) {
        this.username = username;
        playlists = new ArrayList<>();
    }

    // Returns the username
    public String getUsername() {
        return username;
    }

    // Returns the user's playlists
    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    // Creates a playlist based on its type
    public Playlist createPlaylist(String name, String type) {
        Playlist playlist = null;

        if (type.equals("pop")) {
            playlist = new PopPlaylist(name);
        } else if (type.equals("rock")) {
            playlist = new RockPlaylist(name);
        } else if (type.equals("jazz")) {
            playlist = new JazzPlaylist(name);
        }

        if (playlist != null) {
            playlists.add(playlist);
        }

        return playlist;
    }

    // Removes a playlist from the user's list
    public void deletePlaylist(Playlist playlist) {
        playlists.remove(playlist);
    }

    // Adds a song to one of the user's playlists
    public void addSongToPlaylist(Playlist playlist, Song song) {
        if (playlists.contains(playlist)) {
            playlist.addSong(song);
        }
    }

    // Removes a song from one of the user's playlists
    public void removeSongFromPlaylist(Playlist playlist, Song song) {
        if (playlists.contains(playlist)) {
            playlist.removeSong(song);
        }
    }
}