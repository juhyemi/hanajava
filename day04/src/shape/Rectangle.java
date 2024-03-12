package shape;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(int x, int y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getCircume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
