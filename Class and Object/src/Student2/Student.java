package Student2;

public class Student {
    private String name;
    private int age;
    private String gender;
    private double gpa;

    /**
     * constructor.
     * @param name nos
     * @param age aos
     * @param gender gos
     * @param gpa gos
     */
    public Student(String name, int age, String gender, double gpa) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.gpa = gpa;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("GPA: " + gpa);
    }
}
