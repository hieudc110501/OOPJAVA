package PolyLine;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> points;

    public PolyLine() {
        this.points = new ArrayList<Point>();
    }

    /**
     * constructor.
     * @param points pop
     */
    public PolyLine(List<Point> points) {
        this.points = points;
    }

    public void appendPoint(Point point) {
        points.add(point);
    }

    public void appendPoint(int x, int y) {
        points.add(new Point(x, y));
    }

    public double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public double getLength() {
        double res = 0;
        for (int i = 0; i < points.size()-1; i++) {
            res += distance(points.get(i), points.get(i + 1));
        }
        return res;
    }

    public void display() {
        System.out.println("PolyLine: " + getLength());
    }
}
