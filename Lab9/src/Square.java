public class Square extends Shape2D{

    public Square(double width){
        this.width = width;
        //super(width,width); bu da olur
    }

    @Override
    public double getArea() {
        return width * width;
    }

    @Override
    public String toString() {
        return "Area: " + getArea();
    }
}
