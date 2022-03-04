package VariableHiking;

public class Main {
    public static void main(String[] args) {
        SuperClass a = new Subclass();
        System.out.println(a.x);
        System.out.println(((Subclass)a).x);
    }
}
