public class Main {
    public static void main(String[] args) {
        Square s1 = new Square(10);
        Square s2 = new Square(5);
        Rectangle r1 = new Rectangle(5, 10);
        Circle c1 = new Circle(6);

        Sphere sp1 = new Sphere(5, 10);
        Cylinder cy1 = new Cylinder(10, 2);

        compareArea(s1, s2);
        compareVolumes(sp1, cy1);
    }

    public static void compareVolumes(Shape3D s1, Shape3D s2){
        if(s1.getVolume() > s2.getVolume()){
            System.out.println("First volume is greater than second volume " + s1.getVolume() + " is bigger");
        }
        else if(s1.getVolume() == s2.getVolume()){
            System.out.println("volume values is equals");
        }
        else{
            System.out.println("Second volume is greater than second volume " + s2.getVolume() + " is bigger");
        }

    }

    public static void compareArea(Shape2D s1, Shape2D s2){
        if(s1.getArea() > s2.getArea()){
            System.out.println("First area is greater than second area " + s1.getArea() + " is bigger");
        }
        else if(s1.getArea() == s2.getArea()){
            System.out.println("Area values is equals");
        }
        else{
            System.out.println("Second area is greater than second area " + s2.getArea() + " is bigger");
        }
    }
}