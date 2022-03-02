package Account;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1, "Hieu" , 2000);
        System.out.println(account1);
        account1.withdraw(2100);
        account1.deposit(2000);
        System.out.println(account1);
        account1.withdraw(3000);
        System.out.println(account1);
    }
}
