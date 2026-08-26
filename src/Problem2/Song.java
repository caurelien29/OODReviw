package Problem2;

public class Song {
    private String title;
    private Double duration;
    private String artist;

    public Song(String title , String artist,double duration) {
        this.title = title;

        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public double getDuration() {

        return duration;
    }

    public void setDuration(double duration) {

        this.duration = duration;
    }

    public String getArtist() {

        return artist;
    }

    public void setArtist(String artist) {

        this.artist = artist;
    }

}