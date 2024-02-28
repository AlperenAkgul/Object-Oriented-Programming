public class Sphere extends Shape3D{
    public Sphere(double depth, double radius){
        super(0, radius);
        this.depth = depth;
    }

    @Override
    public double getVolume() {
        return 4/3*PI*radius*radius*radius;
    }

    @Override
    public double getArea() {
        return 4*PI*radius*radius;
    }

    @Override
    public String toString() {
        return getVolume() + " " + getArea();
    }
}
