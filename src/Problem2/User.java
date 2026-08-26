package Problem2;

import java.util.ArrayList;

public class User {
    private String username;
    private ArrayList<Playlist> playlists;

    public User(String username) {
        this.username = username;
        playlists = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

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

    public void deletePlaylist(Playlist playlist) {
        playlists.remove(playlist);
    }

    public void addSongToPlaylist(Playlist playlist, Song song) {
        if (playlists.contains(playlist)) {
            playlist.addSong(song);
        }
    }

    public void removeSongFromPlaylist(Playlist playlist, Song song) {
        if (playlists.contains(playlist)) {
            playlist.removeSong(song);
        }
    }
}