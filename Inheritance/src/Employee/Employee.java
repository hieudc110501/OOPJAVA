package Employee;

public abstract class Employee {
    private String name;
    private int salary;

    /**
     * constructor.
     * @param name noe
     * @param salary soe
     */
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}
