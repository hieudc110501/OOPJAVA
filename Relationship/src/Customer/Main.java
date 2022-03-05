package Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Hieu", 10);
        Invoice invoice = new Invoice(1, customer, 10000);
        invoice.display();
    }
}
