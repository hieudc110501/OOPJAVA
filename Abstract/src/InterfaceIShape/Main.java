package InterfaceIShape;

public class Main {
    public static void main(String[] args) {
        IShape[] iShapes = new IShape[2];
        iShapes[0] = new Rectangle(3.4 , 4.6);
        iShapes[1] = new Circle(3.3);
        iShapes[0].display();
        iShapes[1].display();
    }
}
