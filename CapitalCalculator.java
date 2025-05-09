import java.util.Scanner;

public class CapitalCalculator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the initial capital: ");
      double capital = input.nextDouble();

      System.out.print("Enter the annual bank interest rate (%): ");
      double interestRate = input.nextDouble() / 100;

      System.out.print("Enter the number of years: ");
      int years = input.nextInt();

      double capitalAfterYears = capital * Math.pow(1 + interestRate, years);
      System.out.printf("Capital after %d years: %.2f", years, capitalAfterYears);

      input.close();
   }
}
