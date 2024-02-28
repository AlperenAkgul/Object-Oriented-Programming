import java.util.ArrayList;

public class Movie extends Asset{
    ArrayList<Consumer> actors;
    Consumer director;

    public Movie(int id, String name, ArrayList<Integer> scores, int release_year, int price,
         Category category, String type, ArrayList<Consumer> actors, Consumer director){

        super(id, name, scores, release_year, price, category, type);
        this.actors = actors;
        this.director = director;
    }

    public boolean deleteActor(int consumerId){
        for(Consumer c : actors){
            if(consumerId == c.id){
                actors.remove(c);
                return true;
            }
        }
        return false;
    }

    void addActor(Consumer actor){
        this.actors.add(actor);
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
        System.out.println("Actors: ");
        for(Consumer c : actors)
            System.out.println(c);
        System.out.println("Director: " + director);
        System.out.println();
    }
}
