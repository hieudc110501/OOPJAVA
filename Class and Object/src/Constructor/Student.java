package Constructor;

import java.sql.SQLOutput;

public class Student {
    private String name;
    private int age;

    /**
     * constructor
     * @param name nos
     * @param age aos
     */
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
