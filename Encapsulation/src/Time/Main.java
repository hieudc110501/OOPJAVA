package Time;

public class Main {
    public static void main(String[] args) {
        Time time = new Time(12,1,1);
        time.display();
        time.setTime(23,59,59);
        time.display();
        time.nextSecond();
        time.display();
        time.setTime(7,0,0);
        time.previousSecond();
        time.display();
    }

}
