package Problem2;

public class Main {
    public static void main(String[] args) {

        User user = new User("Cooper");

        Song song1 = new Song("Blinding Lights", "The Weeknd", 3.20);
        Song song2 = new Song("Shake It Off", "Taylor Swift", 3.39);
        Song song3 = new Song("Back in Black", "AC/DC", 4.15);
        Song song4 = new Song("Dream On", "Aerosmith", 4.27);
        Song song5 = new Song("Take Five", "Dave Brubeck", 5.24);
        Song song6 = new Song("My Favorite Things", "John Coltrane", 13.42);

        Playlist pop = user.createPlaylist("My Pop", "pop");
        Playlist rock = user.createPlaylist("My Rock", "rock");
        Playlist jazz = user.createPlaylist("My Jazz", "jazz");

        user.addSongToPlaylist(pop, song1);
        user.addSongToPlaylist(pop, song2);

        user.addSongToPlaylist(rock, song3);
        user.addSongToPlaylist(rock, song4);

        user.addSongToPlaylist(jazz, song5);
        user.addSongToPlaylist(jazz, song6);

        // Polymorphism
        for (Playlist playlist : user.getPlaylists()) {
            System.out.println("\nPlaylist: " + playlist.getName());
            System.out.println("Vibe: " + playlist.getVibe());
            playlist.playAllSongs();
        }
    }
}
