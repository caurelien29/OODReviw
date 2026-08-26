package Problem2;

public class RockPlaylist extends Playlist {

    public RockPlaylist(String name) {
        super(name);
    }

    @Override
    public void playAllSongs() {
        System.out.println("Playing Rock playlist: " + getName());

        for (Song song : getSongs()) {
            System.out.println("Playing " + song.getTitle() + " by " + song.getArtist());
        }
    }

    @Override
    public String getVibe() {
        return "Electric and active!";
    }
}

