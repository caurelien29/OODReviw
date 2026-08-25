package Problem2;

public class Song {
    private String title;
    private int duration;
    private String artist;

    public Song(String title,int duration , String artist) {
        this.title = title;
        this.duration = duration;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

}