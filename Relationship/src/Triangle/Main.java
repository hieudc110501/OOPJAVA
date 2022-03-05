package Triangle;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3,4);
        Point p2 = new Point(-2, 3);
        Point p3 = new Point(1, -5);

        Triangle x = new Triangle(3,4,-1,3,4,-6);
        Triangle y = new Triangle(p1, p2, p3);

        x.display();
        y.display();
    }
}
