public class TimeShifting {
    public static void main(String[] args) {
        Time t1 = new Time(10, 12, 14);
        Time t2 = new Time(12, 18, 20);
        
        t1.minute += 6;
        t2.hour -= 2;
        
        t1.displayTime();
        t2.displayTime();
    }
}
