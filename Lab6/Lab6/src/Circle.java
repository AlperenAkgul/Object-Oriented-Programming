public class Circle {
    private static double PI = 3.141519;
    private double radius;
    public static int counter;

    public Circle(double radius){
        this.radius = radius;
        counter++;
    }

    public double computeArea(){
        return PI * radius * radius;
    }

}
