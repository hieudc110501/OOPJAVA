package Person2;

public class Student extends Person{
    private double gpa;

    /**
     * constructor1.
     * @param name nos
     * @param age aos
     * @param address aos
     * @param gpa gos
     */
    public Student(String name, int age, String address, double gpa) {
        super(name, age, address);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("GPA: " + gpa);
    }
}
