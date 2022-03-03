package UpDownCasting;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        //Up-Casting: from ChildClass to ParentClass
        a.sound();

        //Down-Casting 1: from ParentClass to ChildClass
        ((Dog)a).play();

        //Down-Casting 2
        Dog dog = (Dog)a;
        dog.play();
    }
}
