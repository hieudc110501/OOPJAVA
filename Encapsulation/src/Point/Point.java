package Point;

public class Point {
    private double x;
    private double y;

    public Point() {};

    /**
     * constructor.
     * @param x x
     * @param y y
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x,22) + Math.pow(this.y - y, 2));
    }

    public double distance(Point another) {
        return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2));
    }
}
