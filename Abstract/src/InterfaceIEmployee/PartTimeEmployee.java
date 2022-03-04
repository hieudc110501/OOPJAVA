package InterfaceIEmployee;

public class PartTimeEmployee extends Employee{
    private int workingHour;

    /**
     * constructor1.
     * @param name nope
     * @param paymentPerHour pope
     * @param workingHour wope
     */
    public PartTimeEmployee(String name, int paymentPerHour, int workingHour) {
        super(name, paymentPerHour);
        this.workingHour = workingHour;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * workingHour;
    }

    @Override
    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + calculateSalary());
    }
}
