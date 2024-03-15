import java.util.Comparator;

public class ScoreComparator implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2){
        if (m1.getAvgScore() < m2.getAvgScore()) return 1;
        if (m1.getAvgScore() > m2.getAvgScore()) return -1;
        return 0;
    }
}
