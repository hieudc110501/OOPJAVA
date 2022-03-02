package Student;

public class Student {
    private String name;
    private char gender;

    /**
     * constructor1.
     */
    public Student() {
        name = "Unknown";
        gender = 'u';
    }

    /**
     * constructor2.
     * @param name nos
     */
    public Student(String name) {
        this.name = name;
        gender = 'u';
    }

    /**
     * constructor3.
     * @param gender gos
     */
    public Student(char gender) {
        name = "Unknown";
        this.gender = gender;
    }

    /**
     * constructor4.
     * @param name nos
     * @param gender gos
     */
    public Student(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public void display() {
        if (name == "Unknown") System.out.println("Name: Unknown");
        else System.out.println("Name: " + name);

        if (gender == 'f') System.out.println("Gender: Female");
        else if (gender == 'm') System.out.println("Gender: Male");
        else System.out.println("Gender: Unknown");
    }

}
