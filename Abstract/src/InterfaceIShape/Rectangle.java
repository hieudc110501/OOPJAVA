package InterfaceIShape;

public class Rectangle implements IShape{
    private double length;
    private double width;

    /**
     * constructor.
     * @param length lor
     * @param width wor
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public void display() {
        System.out.println("Area of Rectangle: " + getArea());
        System.out.println("Perimeter of Rectangle: " + getPerimeter());
    }
}
