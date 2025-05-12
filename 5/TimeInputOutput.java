import java.util.Scanner;

public class Time {
  private int hours;
  private int minutes;


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
    int howManyTimes;
    Scanner scanner = new Scanner(System.in);
    System.out.print("How many times do you want to enter? ");
    howManyTimes = scanner.nextInt();
    Time[] times = new Time[howManyTimes];

    for (int i = 0; i < howManyTimes; i++) {
      times[i] = new Time();
      times[i].readTime();
    }

    for (int i = 0; i < howManyTimes; i++) {
      times[i].displayTime();
    }
  }
}
