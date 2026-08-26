package Problem2;

public class JazzPlaylist extends Playlist {

    // Creates a jazz playlist
    public JazzPlaylist(String name) {
        super(name);
    }

    // Plays all songs in the jazz playlist
    @Override
    public void playAllSongs() {
        System.out.println("Playing Jazz playlist: " + getName());

        for (Song song : getSongs()) {
            System.out.println("Playing " + song.getTitle() + " by " + song.getArtist());
        }
    }

    // Returns the vibe of the playlist
    @Override
    public String getVibe() {
        return "Smoth and relaxing!";
    }
}