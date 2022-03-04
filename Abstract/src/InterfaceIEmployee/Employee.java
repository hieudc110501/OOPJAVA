package InterfaceIEmployee;

public abstract class Employee implements IEmployee{
    private String name;
    private int paymentPerHour;

    /**
     * constructor.
     * @param name noe
     * @param paymentPerHour noe
     */
    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public void display() {};
}