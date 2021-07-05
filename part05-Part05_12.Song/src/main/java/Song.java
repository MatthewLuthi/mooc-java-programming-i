
import java.util.Objects;


public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Song)) {
            return false;
        }
        if (getClass() != compared.getClass()) {
            return false;
        }
        
        final Song other = (Song) compared;
        if (this.artist.equals(other.artist) &&
                this.name.equals(other.name) &&
                this.durationInSeconds == other.durationInSeconds) {
            return true;
        }
        return false;
    }


    
}
