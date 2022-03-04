package PersonAbstract;

public class Employee extends Person{
    private int salary;

    /**
     * constructor2.
     * @param name noe
     * @param address aoe
     * @param salary soe
     */
    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("Employee name: " + getName());
        System.out.println("Employee address: " + getAddress());
        System.out.println("Employee salary: " + salary);
    }
}
