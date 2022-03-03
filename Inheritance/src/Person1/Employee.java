package Person1;

public class Employee extends Person{
    private int salary;

    /**
     * constructor2.
     * @param name nop
     * @param gender gop
     * @param salary sop
     */
    public Employee(String name, String gender, int salary) {
        super(name, gender);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }
}
