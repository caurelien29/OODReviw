package Problem2;

public class RockPlaylist extends Playlist {

    // Creates a rock playlist
    public RockPlaylist(String name) {
        super(name);
    }

    // Plays all songs in the rock playlist
    @Override
    public void playAllSongs() {
        System.out.println("Playing Rock playlist: " + getName());

        for (Song song : getSongs()) {
            System.out.println("Playing " + song.getTitle() + " by " + song.getArtist());
        }
    }

    // Returns the vibe of the playlist
    @Override
    public String getVibe() {
        return "Electric and active!";
    }
}