public class Rectangle extends Shape2D{

    public Rectangle(double height, double width){
        super(height, width);
    }

    @Override
    public String toString() {
        return "Area: " + getArea();
    }

    @Override
    public double getArea() {
        return (height*width)/2;
    }
}
