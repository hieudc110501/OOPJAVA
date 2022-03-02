package Date;

public class Date {
    private int day;
    private int month;
    private int year;

    /**
     * constructor.
     * @param day dod
     * @param month mod
     * @param year yod
     */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void display() {
        if (day / 10 == 0)
            System.out.print("0" + day + "/");
        else
            System.out.print(day + "/");

        if (month / 10 == 0)
            System.out.print("0" + month + "/");
        else
            System.out.print(month + "/");
        System.out.print(year);
    }
}
