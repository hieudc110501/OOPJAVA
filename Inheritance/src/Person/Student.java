package Person;

public class Student extends Person{
    private double gpa;

    public Student(String name, int dob, double gpa) {
        super(name, dob);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void display() {
        System.out.println("Name :" + getName());
        System.out.println("Date of birth: " +getDob());
        System.out.println("GPA: " + gpa);
    }
}
