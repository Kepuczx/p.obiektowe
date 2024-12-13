import java.util.ArrayList;
import java.util.Arrays;

public class MusicAlbum {
    private String title;
    private String artist;
    //zamienic na liste->
    private double[] ratings;
    public MusicAlbum(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.ratings = new double[0];
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public double[] getRatings() {
        return ratings;
    }

    public void addRating(double rating) {
        double[] newRatings = Arrays.copyOf(ratings, ratings.length + 1);
        newRatings[ratings.length] = rating;
        ratings = newRatings;
    }
    public void removeRating(double rating) {
        for(int i = 0; i < ratings.length; i++) {
            if(ratings[i] == rating){
                double[] newRatings = new double[ratings.length - 1];
                System.arraycopy(ratings, 0, newRatings, 0, i);
                System.arraycopy(ratings, i + 1, newRatings, i, ratings.length - i - 1);
                ratings = newRatings;
                break;
            }
        }
    }
    @Override
    public String toString() {
        return "MusicAlbum{" +
                "title=" + title +
                ", artist=" + artist +
                ", ratings=" + Arrays.toString(ratings) +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        MusicAlbum that = (MusicAlbum) o;
        if(!title.equals(that.title)) return false;
        if(!artist.equals(that.artist)) return false;
        return Arrays.equals(ratings, that.ratings);
    }
    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + artist.hashCode();
        result = 31 * result + Arrays.hashCode(ratings);
        return result;
    }

}
