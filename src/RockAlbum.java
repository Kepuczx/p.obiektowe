import java.util.Arrays;

public class RockAlbum extends MusicAlbum{
    private String rockGenre;

    public RockAlbum(String title, String artist, String rockGenre){
        super(title, artist);
        this.rockGenre = rockGenre;
    }
    @Override
    public String toString() {
        return "MusicAlbum{" +
                "rockGenre=" + rockGenre +
                ", title=" + getTitle() +
                ", artist=" + getArtist() +
                ", ratings=" + Arrays.toString(getRatings()) +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        if(!super.equals(o)) return false;

        RockAlbum rockAlbum = (RockAlbum) o;
        return rockGenre.equals(rockAlbum.rockGenre);
    }
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + rockGenre.hashCode();
        return result;
    }
}
