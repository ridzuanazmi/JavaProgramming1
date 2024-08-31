
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object obj) {
        // Check if the obj is the same instance as this
        if (this == obj) {
            return true;
        }

        // Check if the obj is an instance of Song
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cast the object to Song
        Song song = (Song) obj;

        // Compare artist, title, and durationInSeconds
        return artist.equals(song.artist)
                && name.equals(song.name)
                && durationInSeconds == song.durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
