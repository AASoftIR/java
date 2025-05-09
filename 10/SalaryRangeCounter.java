 import java.util.Scanner;

public class SalaryCounter {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int numberOfEmployees = 10;
      int count = 0;

      for (int i = 1; i <= numberOfEmployees; i++) {
         System.out.printf("Enter the salary of employee %d: ", i);
         double salary = input.nextDouble();

         if (salary > 10000 && salary < 20000) {
            count++;
         }
      }
      System.out.printf("%d employees receive salaries between 10,000 and 20,000.", count);

      input.close();
   }
}
