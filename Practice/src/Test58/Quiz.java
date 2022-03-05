package Test58;

import org.w3c.dom.ls.LSOutput;

interface Ishape1 {
    double primeter();
}

interface Ishape2 {
    double area();
}

class Rectangle implements Ishape1, Ishape2 {
    private int h;
    private int w;

    /**
     * constructor.
     * @param h h
     * @param w w
     */
    public Rectangle(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public double primeter() {
        return (h + w) * 2;
    }

    @Override
    public double area() {
        return h * w;
    }
}

public class Quiz {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println("Primeter: " + rectangle.primeter());
        System.out.println("Area: " + rectangle.area());
    }
}
