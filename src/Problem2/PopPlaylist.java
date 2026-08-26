package Problem2;

public class PopPlaylist extends Playlist {

    public PopPlaylist(String name) {
        super(name);
    }

    @Override
    public void playAllSongs() {
        System.out.println("Playing Pop playlist: " + getName());

        for (Song song : getSongs()) {
            System.out.println("Playing " + song.getTitle() + " by " + song.getArtist());
        }
    }

    @Override
    public String getVibe() {
        return "Fun and catchy!";
    }
}
