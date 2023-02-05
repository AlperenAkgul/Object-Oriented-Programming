import java.awt.*;

public abstract class Shape2D {
    public final double PI = 3.141519;
    public double height;
    public double width;
    public double radius;

    public Shape2D(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Shape2D(double radius){
        this.radius = radius;
    }

    //hata vermesin diye boş constructor
    public Shape2D(){

    }

    public abstract double getArea();
    public abstract String toString();
}
