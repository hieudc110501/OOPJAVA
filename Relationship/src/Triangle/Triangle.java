package Triangle;

public class Triangle {
    Point vertice1;
    Point vertice2;
    Point vertice3;

    /**
     * constructor.
     * @param vertice1 vot
     * @param vertice2 vot
     * @param vertice3 vot
     */
    public Triangle(Point vertice1, Point vertice2, Point vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    /**
     * constructor.
     * @param x1 x
     * @param y1 y
     * @param x2 x
     * @param y2 y
     * @param x3 x
     * @param y3 y
     */
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.vertice1 = new Point(x1 , y1);
        this.vertice2 = new Point(x2 , y2);
        this.vertice3 = new Point(x3 , y3);
    }

    public double distance(Point vertice1, Point vertice2) {
        return Math.sqrt(Math.pow(vertice1.getX() - vertice2.getX(), 2) + Math.pow(vertice1.getY() - vertice2.getY(), 2));
    }

    public double getPerimeter() {
        return distance(vertice1, vertice2) + distance(vertice2, vertice3) + distance(vertice1, vertice3);
    }

    public void display() {
        System.out.println("Perimeter: " + getPerimeter());
    }
}
