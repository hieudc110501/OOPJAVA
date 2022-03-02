package Account;

public class Account {
    private int id;
    private String name;
    private int balance;

    /**
     * constructor1.
     * @param id ioa
     * @param name noa
     */
    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * constructor2.
     * @param id ioa
     * @param name noa
     * @param balance boa
     */
    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance < amount)
            System.out.println("That amount exceeds your current balance");
        else
            balance -= amount;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + balance;
    }
}
