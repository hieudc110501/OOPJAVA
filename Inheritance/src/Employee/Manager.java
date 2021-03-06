package Employee;

public class Manager extends Employee{
    private int bonus;

    /**
     * constructor1.
     * @param name nom
     * @param salary som
     * @param bonus bom
     */
    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + this.getSalary());
    }
}
