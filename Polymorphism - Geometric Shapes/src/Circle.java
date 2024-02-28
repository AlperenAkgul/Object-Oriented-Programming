public class Circle extends Shape2D{

    public Circle(double radius){
        super(radius);
        //this.radius = radius; //comes from shape2d
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Radius: " + radius + "Circle Area" + this.getArea();
    }
}
