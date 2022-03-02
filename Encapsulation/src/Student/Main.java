package Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of Student: ");
        n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i ++) {
            System.out.println("Enter Id: ");
            int id = sc.nextInt();
            System.out.println("Enter Name: ");
            String name = sc.next();
            System.out.println("Enter Age: ");
            int age = sc.nextInt();
            System.out.println("Enter Address: ");
            String address = sc.next();
            System.out.println("Enter Score: ");
            int score = sc.nextInt();
            students[i] = new Student(id, name, age, address, score);
        }

        for (int i = 0; i < n; i ++) {
            students[i].display();
        }
    }
}
