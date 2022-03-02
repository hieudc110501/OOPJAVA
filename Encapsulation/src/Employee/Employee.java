package Employee;

import java.util.Scanner;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(){};
    /**
     * constructor.
     * @param id ioe
     * @param firstName foe
     * @param lastName loe
     * @param salary soe
     */
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id: ");
        id = sc.nextInt();
        System.out.println("Enter FirstName: ");
        firstName = sc.next();
        System.out.println("Enter LastName: ");
        lastName = sc.next();
        System.out.println("Enter Salary: ");
        salary = sc.nextInt();
    }

    public void Output() {
        System.out.println("Id: " + id);
        System.out.println("FullName: " + getFullName());
        System.out.println("Salary: " + salary);
    }
}
