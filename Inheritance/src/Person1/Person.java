package Person1;

public class Person {
    private String name;
    private String gender;

    /**
     * constructor1.
     * @param name nop
     * @param gender gop
     */
    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + getGender());
    }
}
