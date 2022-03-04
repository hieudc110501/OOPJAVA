package PersonAbstract;

public class Main {
    public static void main(String[] args) {
        Person person = new Employee("Hieu", "Thai Binh", 2000);
        person.display();
        Person person1 = new Customer("Hieu", "Kien Xuong", 10000);
        person1.display();
    }
}
