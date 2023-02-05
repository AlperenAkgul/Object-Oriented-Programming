import java.util.ArrayList;
import java.util.Objects;
import java.util.SortedMap;

public class DisneyPlus {
    ArrayList<Asset> assets;
    User credential = null;
    boolean isLogin = false;

    public DisneyPlus(ArrayList<Asset> assets){
        this.assets = assets;
    }

    public void login(User user){
        if((Objects.equals(user.userName, "testUser")) && (user.password == "123456")){
            isLogin = true;
            user.loginStatus = true;
            credential = user;
        }
        else
            System.out.println("Wrong username or password!");
    }

    public void addMovie(Movie m1){
        if(credential.loginStatus)
            assets.add(m1);
        else
            System.out.println("You have not logged in!");
    }

    public boolean removeMovie(int movieId){
        for(Asset m : assets){
            if(m instanceof Movie){
                if(movieId == m.id){
                    assets.remove(m);
                    return true;
                }
            }
        }
        return false;
    }

    public void addBook(Book b1){
        if(credential.loginStatus)
            assets.add(b1);
        else
            System.out.println("You have not logged in!");
    }

    public boolean removeBook(int bookId){
        for(Asset b : assets){
            if(b instanceof Book){
                if(bookId == b.id){
                    assets.remove(b);
                    return true;
                }
            }
        }
        return false;
    }

    public void addAsset(Asset m2){
        if(credential.loginStatus)
            assets.add(m2);
        else
            System.out.println("You have not logged in!");
    }

    public void N1(){
        for(Asset a: assets){
            if(a instanceof Movie){
                Consumer oldest = ((Movie) a).actors.get(0);
                for(int i = 1; i < ((Movie) a).actors.size(); i++){
                    if((2022 - ((Movie) a).actors.get(i).birthYear) > (2022 - oldest.birthYear)){
                        oldest = ((Movie) a).actors.get(i);
                    }
                }
                System.out.println(oldest + " Birth Year: " + oldest.birthYear);
            }
        }
    }

    public void N2(){
        int counter = 0;
        Movie lowest = null;

        for(Asset a: assets){
            if(a instanceof Movie){
                if(counter == 0){ //Assigning first movie's average score for comparison
                    lowest = (Movie)a;
                    counter++;
                }
                else{
                    if(a.getAvgScore() < lowest.getAvgScore()){
                        lowest = (Movie) a;
                    }
                }
            }
        }
        System.out.println("Movie Name: " + lowest.name + " Average Score: " + lowest.getAvgScore());
    }

    public void N3(int movie_id){
        Consumer actor = new Consumer();
        actor.salary = 0;
        for(Asset a : assets){
            if(a instanceof Movie){
                if(movie_id == a.id){
                    for(Consumer c : ((Movie) a).actors){
                        if(c.salary > actor.salary){
                            actor = c;
                        }
                    }
                    System.out.println("Highest paid actor in " + a.name + " is " + actor + ". Salary: " + actor.salary);
                }
            }
        }
    }

    public void N4(int category_id){
        int cost = 0;
        int counter = 0;
        for(Asset a : assets){
            if(a.category.id == category_id){
                if(counter == 0){ //Assigning first asset's price for comparison
                    cost = a.price;
                    counter++;
                }
                else{
                    if(a.price < cost){
                        cost = a.price;
                    }
                }
            }
        }

        for(Asset a : assets){
            if(a.category.id == category_id){
                if(a.price == cost){
                    System.out.println("Cheapest asset in Disney+ is: ");
                    a.showDetail();
                }
            }
        }
    }

    public void N5(int consumer_id){
        for(Asset a : assets){
            if(a instanceof Movie){
                for(Consumer c : ((Movie) a).actors){
                    if(c.id == consumer_id){
                        System.out.println(c + " has acted on this movie: ");
                        a.showDetail();
                    }
                }
            }
        }
    }

    public void N6(){
        double ave = 0;
        for(Asset a : assets){
            if(a.getAvgScore() > ave){
                ave = a.getAvgScore();
            }
        }

        for(Asset a : assets){
            if(a.getAvgScore() == ave){
                System.out.println("This Asset has got the highest average score among all assets: ");
                a.showDetail();
            }
        }
    }
}
