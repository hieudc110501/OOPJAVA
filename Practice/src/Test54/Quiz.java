package Test54;

class A {
    public A() {
        System.out.println("A");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("B");
    }
}

public class Quiz {
    public static void test(B b) {
    }
    public static void main(String[] args) {
        B b = new B();
        test(b);
    }
}
