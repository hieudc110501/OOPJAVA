package Test77;

class A {
    private int x = 10;

    public void total(A a) {
        a.x = 1;
        System.out.println(a.x);
    }
}

public class Quiz {
    public static void main(String[] args) {
        A a = new A();
        a.total(a);
    }
}
