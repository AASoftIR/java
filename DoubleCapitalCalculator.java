 import java.util.Scanner;

public class DoubleCapitalCalculator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the initial capital: ");
      double capital = input.nextDouble();

      System.out.print("Enter the annual bank interest rate (%): ");
      double interestRate = input.nextDouble() / 100;

      int yearsToDouble = 0;
      while (capital < 2 * input.nextDouble()) {
         capital *= 1 + interestRate;
         yearsToDouble++;
      }
      System.out.printf("It will take %d years for the capital to double.", yearsToDouble);

      input.close();
   }
}
