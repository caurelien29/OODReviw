package Problem2;

public class Song {
    private String title;
    private Double duration;
    private String artist;

    // Creates a song with its title, artist, and duration
    public Song(String title , String artist,double duration) {
        this.title = title;

        this.artist = artist;
        this.duration = duration;
    }

    // Returns the song title
    public String getTitle() {

        return title;
    }

    // Changes the song title
    public void setTitle(String title) {

        this.title = title;
    }

    // Returns the song duration
    public double getDuration() {

        return duration;
    }

    // Changes the song duration
    public void setDuration(double duration) {

        this.duration = duration;
    }

    // Returns the artist name
    public String getArtist() {

        return artist;
    }

    // Changes the artist name
    public void setArtist(String artist) {

        this.artist = artist;
    }

}