import java.util.Scanner;
import java.time.LocalTime;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    LocalTime[] times = new LocalTime[40];
    
    // Read times from the user
    for (int i = 0; i < 40; i++) {
      System.out.print("Enter time (hh:mm:ss): ");
      String timeStr = input.nextLine();
      times[i] = LocalTime.parse(timeStr);
    }
    
    // Display the times one by one
    for (int i = 0; i < 40; i++) {
      System.out.println(times[i].toString());
    }
  }
}
