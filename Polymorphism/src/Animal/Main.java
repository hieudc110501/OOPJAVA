package Animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Animal();
        animals[1] = new Dog();
        animals[2] = new Cat();

        for (int i = 0; i < 3; i ++) {
            animals[i].sound();
        }
    }
}
