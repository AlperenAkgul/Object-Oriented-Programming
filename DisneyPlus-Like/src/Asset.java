import java.util.ArrayList;

public abstract class Asset {
    int id;
    String name;
    ArrayList<Integer> scores;
    int release_year;
    Category category;
    int price;
    String type;

    Asset(int id, String name, ArrayList scores, int release_year, int price, Category category, String type){
        this.id = id;
        this.name = name;
        this.scores = scores;
        this.release_year = release_year;
        this.price = price;
        this.category = category;
        this.type = type;
    }

    void addScore(int score){
        this.scores.add(score);
    }

    double getMaxScore(){
        int max = scores.get(0);
        for(int i = 1; i < scores.size(); i++){
            if(scores.get(i) > max)
                max = scores.get(i);
        }
        return max;
    }

    double getMinScore(){
        int min = scores.get(0);
        for(int i = 1; i < scores.size(); i++){
            if(scores.get(i) < min)
                min = scores.get(i);
        }
        return min;
    }

    double getAvgScore(){
        int sum = 0;
        for(int i = 0; i < scores.size(); i++){
            sum += scores.get(i);
        }
        return sum / scores.size();
    }

    abstract void showDetail();
}
