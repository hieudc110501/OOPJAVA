package Time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    /**
     * constructor.
     * @param hour hot
     * @param minute mot
     * @param second sot
     */
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void nextSecond() {
        if (second == 59) {
            if (minute == 59) {
                if (hour == 23) {
                    hour = 0;
                    minute = 0;
                    second = 0;
                }
                else {
                    hour += 1;
                    minute = 0;
                }
            }
            else {
                minute += 1;
                second = 0;
            }
        }
        else {
            second += 1;
        }
    }

    public void previousSecond() {
        if (second == 0) {
            if (minute == 0) {
                if (hour == 0) {
                    hour = 23;
                }
                else {
                    hour -= 1;
                }
                minute = 59;
                second = 59;
            }
            else {
                minute -= 1;
                second = 59;
            }
        }
        else {
            second -= 1;
        }
    }

    public void display() {
        if (hour / 10 == 0)
            System.out.print("0" + hour + ":");
        else
            System.out.print(hour + ":");

        if (minute / 10 == 0)
            System.out.print("0" + minute + ":");
        else
            System.out.print(minute + ":");

        if (second / 10 == 0)
            System.out.print("0" + second + "\n");
        else
            System.out.print(second + "\n");
    }
}
