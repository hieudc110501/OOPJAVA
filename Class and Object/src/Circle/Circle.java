package Circle;

public class Circle {
    private double radius;

    /**
     * constructor.
     * @param radius roc
     */
    public Circle(double radius) {
        this.radius =  radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getCircumference() {
        return 3.14 * 2 * radius;
    }

    public void display() {
        System.out.println("Area of Circle: " + getArea());
        System.out.println("Circumference of Circle: " + getCircumference());
    }
}
