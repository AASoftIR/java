import java.util.Scanner;

public class Time {
  private int hours;
  private int minutes;

  public Time() {
    // constructor
  }

  public void readTime() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter hours: ");
    hours = scanner.nextInt();

    System.out.print("Enter minutes: ");
    minutes = scanner.nextInt();
  }

  public void displayTime() {
    System.out.println("Time: " + hours + ":" + minutes);
  }

  public static void main(String[] args) {
    Time[] times = new Time[5];

    for (int i = 0; i < 5; i++) {
      times[i] = new Time();
      times[i].readTime();
    }

    for (int i = 0; i < 5; i++) {
      times[i].displayTime();
    }
  }
}
