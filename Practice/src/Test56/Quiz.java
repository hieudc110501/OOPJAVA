package Test56;

class Base {
    public void total() {
        show();
    }

    public void show() {
        System.out.println("Base");
    }
}

class Derived extends Base {

    @Override
    public void show() {
        System.out.println("Derived");
    }
}

public class Quiz {
    public static void main(String[] args) {
        Base d = new Derived();
        d.total();
    }
}
