public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void displayTime() {
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
