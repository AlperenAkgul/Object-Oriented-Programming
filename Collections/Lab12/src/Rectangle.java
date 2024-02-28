public class Rectangle implements Comparable<Rectangle>{
    private int width;
    private int height;
    public Rectangle(int height, int width){
        this.width = width;
        this.height = height;
    }

    public int getArea(){
        return width * height;
    }

    @Override
    public int compareTo(Rectangle o) {
        return this.getArea() - o.getArea();
    }

    @Override
    public String toString() {
        return "Width: " + width + " Height: " + height + " Area: " + getArea();
    }
}
