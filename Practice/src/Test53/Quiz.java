package Test53;

class A {
    public int x = 10;
}

class B extends A {
    public int x = 20;

    public void display() {
        System.out.println(this.x);
    }
}

public class Quiz {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
