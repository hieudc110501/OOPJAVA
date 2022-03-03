package UpDownCasting;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("gow gow");
    }

    public void play() {
        System.out.println("this is down-casting");
    }
}
