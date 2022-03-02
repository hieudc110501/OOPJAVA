package Rectangle;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {};

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

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }

    public void display() {
        System.out.println("Area of Rectangle: " + getArea());
        System.out.println("Perimeter of Rentangle: " + getPerimeter());
    }
}
