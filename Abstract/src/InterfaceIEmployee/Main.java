package InterfaceIEmployee;

public class Main {
    public static void main(String[] args) {
        IEmployee[] employee = new IEmployee[2];
        employee[0] = new PartTimeEmployee("Hieu", 10, 4);
        employee[1] = new FullTimeEmployee("Truong", 10);
        employee[0].display();
        employee[1].display();
    }
}
