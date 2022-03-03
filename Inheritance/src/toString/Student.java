package toString;

public class Student {
    private String name;
    private String address;
    private double gpa;

    /**
     * constructor.
     * @param name nos
     * @param address aos
     * @param gpa gos
     */
    public Student(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    public String toString() {
        return name + ", " + address + ", " + gpa + "\n";
    }
}
