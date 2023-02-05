import java.util.ArrayList;

public class Book extends Asset{
    Consumer writer;
    int numberOfPages;

    Book(int id, String name, ArrayList<Integer> scores, int release_year, int price,
         Category category, String type, Consumer writer, int numberOfPages){

        super(id, name, scores, release_year, price, category, type);
        this.writer = writer;
        this.numberOfPages = numberOfPages;
    }

    public void setWriter(Consumer newWriter) {
        this.writer = newWriter;
    }

    @Override
    void addScore(int score) {
        this.scores.add(score);
    }

    @Override
    double getMaxScore() {
        int max = scores.get(0);
        for(int i = 1; i < scores.size(); i++){
            if(scores.get(i) > max)
                max = scores.get(i);
        }
        return max;
    }

    @Override
    double getMinScore() {
        int min = scores.get(0);
        for(int i = 1; i < scores.size(); i++){
            if(scores.get(i) < min)
                min = scores.get(i);
        }
        return min;
    }

    @Override
    double getAvgScore() {
        int sum = 0;
        for(int i = 0; i < scores.size(); i++){
            sum += scores.get(i);
        }
        return sum / scores.size();
    }

    @Override
    void showDetail() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Score: " + getAvgScore());
        System.out.println("Release Year: " + release_year);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category.categoryName);
        System.out.println("Type: " + type);
        System.out.println("Writer: " + writer);
        System.out.println("Number of Pages: " + numberOfPages);
    }
}
