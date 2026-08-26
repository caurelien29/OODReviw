package Problem2;

public class JazzPlaylist extends Playlist {

    public JazzPlaylist(String name) {
        super(name);
    }

    @Override
    public void playAllSongs() {
        System.out.println("Playing Jazz playlist: " + getName());

        for (Song song : getSongs()) {
            System.out.println("Playing " + song.getTitle() + " by " + song.getArtist());
        }
    }

    @Override
    public String getVibe() {
        return "Smoth and relaxing!";
    }
}
