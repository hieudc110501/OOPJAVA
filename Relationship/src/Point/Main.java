package Point;

public class Main {
    public static void main(String[] args) {
        Point a = new Point(2,3);
        Point b = new Point(4,5);

        Line c = new Line(a, b);
        Line d = new Line(2,3,4,5);

        c.display();
        d.display();
    }
}
