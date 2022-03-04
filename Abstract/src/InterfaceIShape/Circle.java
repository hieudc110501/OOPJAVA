package InterfaceIShape;

public class Circle implements IShape{
    private double radius;

    /**
     * constructor.
     * @param radius roc
     */
    public Circle (double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * 3.14;
    }

    @Override
    public void display() {
        System.out.println("Area of Circle: " + getArea());
        System.out.println("Perimeter of Circle: " + getPerimeter());
    }
}
