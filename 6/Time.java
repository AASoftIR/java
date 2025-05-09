import java.util.Scanner;

public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public void readTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time (in format hh:mm:ss): ");
        String timeStr = scanner.nextLine();
        String[] timeParts = timeStr.split(":");
        this.hour = Integer.parseInt(timeParts[0]);
        this.minute = Integer.parseInt(timeParts[1]);
        this.second = Integer.parseInt(timeParts[2]);
    }
    
    public void displayTime() {
        String timeStr = String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
        System.out.println(timeStr);
    }
}
