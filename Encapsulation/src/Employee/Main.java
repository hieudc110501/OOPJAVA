package Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of Employees: ");
        int n;
        n = sc.nextInt();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            employees[i] = new Employee();
            employees[i].Input();
        }

        for (int i = 0; i < n; i ++) {
            employees[i].Output();
        }
    }
}
