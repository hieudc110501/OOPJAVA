package Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(3);
        rectangle.setLength(4);
        rectangle.display();

        Rectangle rectangle1 = new Rectangle(2,3);
        rectangle1.display();
    }
}
