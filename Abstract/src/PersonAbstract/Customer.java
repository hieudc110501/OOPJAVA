package PersonAbstract;

public class Customer extends Person{
    private int balance;

    /**
     * constructor3.
     * @param name noe
     * @param address aoe
     * @param balance boe
     */
    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("Customer name: " + getName());
        System.out.println("Customer address: " + getAddress());
        System.out.println("Customer balance: " + balance);
    }
}
