package Student2;

public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[3];
        student[0] = new Student("Hieu", 21, "Male", 9.9);
        student[1] = new Student("Minh", 21, "Female", 10);
        student[2] = new Student("Truong", 20, "Male", 9.8);
        student[0].display();
        student[1].display();
        student[2].display();
    }
}
