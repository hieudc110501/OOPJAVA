package Test52;

class A {
    public int x = 10;

    public void display() {
        System.out.println(this.x);
    }

}

class B extends A {
    public int x = 20;

    public void Input() {
        System.out.println("Hello");
    }
}


public class Quiz {
    public static void main(String[] args) {
        A b = new B();
        b.display();
    }
}
