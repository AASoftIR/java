import java.util.Scanner;

public class DoublingTimeCalculator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the initial capital: ");
      double initialCapital = input.nextDouble();

      System.out.print("Enter the annual bank interest rate as a decimal: ");
      double interestRate = input.nextDouble();

      int years = yearsToDouble(initialCapital, interestRate);
      System.out.printf("It will take %d years for the capital to double.", years);

      input.close();
   }

   public static int yearsToDouble(double initialCapital, double interestRate) {
      double targetCapital = initialCapital * 2;
      double currentCapital = initialCapital;
      int years = 0;
      while (currentCapital < targetCapital) {
         currentCapital *= (1 + interestRate);
         years++;
      }
      return years;
   }
}
