package InterfaceIEmployee;

public class FullTimeEmployee extends Employee{

    /**
     * constructor2.
     * @param name nofe
     * @param paymentPerHour pofe
     */
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return 8 * getPaymentPerHour();
    }

    @Override
    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Salary :" + calculateSalary());
    }
}
