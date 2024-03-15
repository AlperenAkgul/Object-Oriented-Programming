import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Consumer p1 = new Consumer(1, 1962, 2500, "Person", "One");
        Consumer p2 = new Consumer(2, 2000, 3000, "Person", "Two");
        Consumer p3 = new Consumer(3, 1998, 2750, "Person", "Three");
        Consumer p4 = new Consumer(4, 1954, 1000, "Person", "Four");

        Category c1 = new Category(126, "a2d3f", "Sci-Fi");
        Category c2 = new Category(251, "aabaf", "Horror");
        Category c3 = new Category(333, "abc2f", "History");

        //First Movie
        ArrayList<Integer> Movie1Scores = new ArrayList<Integer>();
        ArrayList<Consumer> Movie1Actors = new ArrayList<Consumer>();
        Movie m1 = new Movie(26, "Movie 1", Movie1Scores, 2019,
                50, c3, "Movie", Movie1Actors, p3);
        m1.addScore(4);
        m1.addScore(7);
        m1.addScore(8);
        m1.addScore(5);
        m1.addActor(p1);
        m1.addActor(p2);
        System.out.println("\nMaximum Score of " + m1.name + ": ");
        System.out.println(m1.getMaxScore());
        System.out.println("Minimum Score of " + m1.name + ": ");
        System.out.println(m1.getMinScore());

        //Second Movie
        ArrayList<Integer> Movie2Scores = new ArrayList<Integer>();
        ArrayList<Consumer> Movie2Actors = new ArrayList<Consumer>();
        Movie m2 = new Movie(41, "Movie 2", Movie2Scores, 2009,
                40, c1, "Movie", Movie2Actors, p4);
        m2.addScore(9);
        m2.addScore(4);
        m2.addScore(10);
        m2.addActor(p4);
        m2.addActor(p1);
        System.out.println("\nMaximum Score of " + m2.name + ": ");
        System.out.println(m2.getMaxScore());
        System.out.println("Minimum Score of " + m2.name + ": ");
        System.out.println(m2.getMinScore());

        ArrayList<Integer> Movie3Scores = new ArrayList<Integer>();
        ArrayList<Consumer> Movie3Actors = new ArrayList<Consumer>();
        Movie m3 = new Movie(41, "Movie 3", Movie3Scores, 2009,
                40, c1, "Movie", Movie3Actors, p4);
        m3.addScore(9);
        m3.addScore(7);
        m3.addScore(9);
        m3.addActor(p3);
        m3.addActor(p1);
        System.out.println("\nMaximum Score of " + m3.name + ": ");
        System.out.println(m3.getMaxScore());
        System.out.println("Minimum Score of " + m3.name + ": ");
        System.out.println(m3.getMinScore());

        ArrayList<Integer> Movie4Scores = new ArrayList<Integer>();
        ArrayList<Consumer> Movie4Actors = new ArrayList<Consumer>();
        Movie m4 = new Movie(41, "Movie 4", Movie4Scores, 2009,
                40, c1, "Movie", Movie4Actors, p4);
        m4.addScore(8);
        m4.addScore(3);
        m4.addScore(5);
        m4.addActor(p2);
        m4.addActor(p3);
        System.out.println("\nMaximum Score of " + m4.name + ": ");
        System.out.println(m4.getMaxScore());
        System.out.println("Minimum Score of " + m4.name + ": ");
        System.out.println(m4.getMinScore());

        //First Book
        ArrayList<Integer> Book1Scores = new ArrayList<Integer>();
        Book b1 = new Book(23, "Book 1", Book1Scores, 2023,
                10, c2, "Book", p1, 220);
        b1.addScore(8);
        b1.addScore(3);
        b1.addScore(5);
        System.out.println("\nAverage Score of " + b1.name + ": ");
        System.out.println(b1.getAvgScore());

        //Second Book
        ArrayList<Integer> Book2Scores = new ArrayList<Integer>();
        Book b2 = new Book(55, "Book 2", Book2Scores, 1985,
                15, c3, "Book", p4, 357);
        b2.addScore(7);
        b2.addScore(1);
        b2.addScore(2);
        System.out.println("\nAverage Score of " + b2.name + ": ");
        System.out.println(b2.getAvgScore());

        //User
        User u1 = new User(7, "User", "One", "testUser", "123456");

        ArrayList<Asset> assets = new ArrayList<Asset>();
        //DisneyPlus
        DisneyPlus disneyPlus =  new DisneyPlus(assets);
        disneyPlus.login(u1);
        disneyPlus.addBook(b1);
        disneyPlus.addBook(b2);
        disneyPlus.addMovie(m1);
        disneyPlus.addMovie(m2);
        disneyPlus.addMovie(m3);
        disneyPlus.addMovie(m4);

        System.out.println("\nAnswer of N1: \n");
        disneyPlus.N1();
        System.out.println("\nAnswer of N2: \n");
        disneyPlus.N2();
        System.out.println("\nAnswer of N3: \n");
        disneyPlus.N3(41); // Movie 2
        System.out.println("\nAnswer of N4: \n");
        disneyPlus.N4(251); // Horror
        System.out.println("\nAnswer of N5: ");
        disneyPlus.N5(1); // Person One
        System.out.println("\nAnswer of N6: \n");
        disneyPlus.N6();
        System.out.println("\nAnswer of N7: \n");
        disneyPlus.N7();
    }
}