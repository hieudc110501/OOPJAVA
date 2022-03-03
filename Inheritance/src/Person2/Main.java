package Person2;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Student("Hieu", 21, "TB", 8.8);
        Person person2 = new Teacher("Truong Hieu", 21, "KX", 2000);
        person1.display();
        person2.display();
    }

}
