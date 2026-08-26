package Problem2;

public class PopPlaylist extends Playlist {

    // Creates a pop playlist
    public PopPlaylist(String name) {
        super(name);
    }

    // Plays all songs in the pop playlist
    @Override
    public void playAllSongs() {
        System.out.println("Playing Pop playlist: " + getName());

        for (Song song : getSongs()) {
            System.out.println("Playing " + song.getTitle() + " by " + song.getArtist());
        }
    }

    // Returns the vibe of the playlist
    @Override
    public String getVibe() {
        return "Fun and catchy!";
    }
}