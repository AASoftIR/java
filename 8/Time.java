import java.util.Scanner;

public class Time {
    int hour;
    int minute;
    int second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public void readTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hour: ");
        this.hour = scanner.nextInt();
        System.out.print("Enter minute: ");
        this.minute = scanner.nextInt();
        System.out.print("Enter second: ");
        this.second = scanner.nextInt();
    }
}
