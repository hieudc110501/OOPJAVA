package PolyLine;

public class Main {
    public static void main(String[] args) {
        PolyLine polyLine = new PolyLine();
        Point[] points = new Point[3];
        for (int i = 0; i < 3; i ++) {
            points[i] = new Point(i, i);
            polyLine.appendPoint(points[i]);
        }
        polyLine.display();
        polyLine.appendPoint(6, 6);
        polyLine.display();
    }
}
