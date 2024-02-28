import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rectangle> listRectangle = new ArrayList<>();
        listRectangle.add((new Rectangle(10, 5)));
        listRectangle.add((new Rectangle(5, 8)));
        listRectangle.add((new Rectangle(20, 10)));
        listRectangle.add((new Rectangle(10, 3)));

        for(Rectangle r: listRectangle){
            System.out.println(r);
        }

        Collections.sort(listRectangle);

        for(Rectangle r: listRectangle){
            System.out.println(r);
        }
    }
}