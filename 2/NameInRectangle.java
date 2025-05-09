
public class MyNameRectangle {
   public static void main(String[] args) {
      int rows = 7;
      int columns = 15;
      String name = "Alireza";

      for (int i = 1; i <= rows; i++) {
         for (int j = 1; j <= columns; j++) {
            if (i == 1 || i == rows || j == 1 || j == columns) {
               System.out.print("$");
            } else if (i == (rows + 1)/2 && j >= (columns - name.length())/2 + 1 
                       && j < (columns - name.length())/2 + name.length() + 1) {
               System.out.print(name.charAt(j - (columns - name.length())/2 - 1));
            } else {
               System.out.print(" ");
            }
         }
         System.out.println();
      }
   }
}
