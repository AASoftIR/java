import java.util.Scanner;

public class PowerSumCalculator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the value of n: ");
      int n = input.nextInt();

      int sum = 0;
      for (int i = 1; i <= n; i++) {
         sum += power(i, i);
      }
      System.out.printf("The sum of powers of numbers from 1 to %d is %d", n, sum);

      input.close();
   }

   public static int power(int base, int exponent) {
      int result = 1;
      for (int i = 1; i <= exponent; i++) {
         result *= base;
      }
      return result;
   }
}
