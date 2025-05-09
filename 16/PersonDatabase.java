import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Person[] people = new Person[10];
    
    // Read information of people from the user
    for (int i = 0; i < 10; i++) {
      System.out.print("Enter first name: ");
      String firstName = input.nextLine();
      System.out.print("Enter last name: ");
      String lastName = input.nextLine();
      System.out.print("Enter national code: ");
      String nationalCode = input.nextLine();
      System.out.print("Enter date of birth (yyyy-mm-dd): ");
      String dobStr = input.nextLine();
      DateOfBirth dob = DateOfBirth.parse(dobStr);
      
      people[i] = new Person(firstName, lastName, nationalCode, dob);
    }
    
    // Display the details of those whose name is Ali
    for (int i = 0; i < 10; i++) {
      if (people[i].getFirstName().equals("Ali")) {
        System.out.println(people[i].toString());
      }
    }
  }
}

class Person {
  private String firstName;
  private String lastName;
  private String nationalCode;
  private DateOfBirth dob;
  
  public Person(String firstName, String lastName, String nationalCode, DateOfBirth dob) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.nationalCode = nationalCode;
    this.dob = dob;
  }
  
  public String getFirstName() {
    return firstName;
  }
  
  public String getLastName() {
    return lastName;
  }
  
  public String getNationalCode() {
    return nationalCode;
  }
  
  public DateOfBirth getDateOfBirth() {
    return dob;
  }
  
  public String toString() {
    return "First Name: " + firstName + ", Last Name: " + lastName +
      ", National Code: " + nationalCode + ", Date of Birth: " + dob.toString();
  }
}

class DateOfBirth {
  private int year;
  private int month;
  private int day;
  
  public DateOfBirth(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }
  
  public static DateOfBirth parse(String dobStr) {
    String[] parts = dobStr.split("-");
    int year = Integer.parseInt(parts[0]);
    int month = Integer.parseInt(parts[1]);
    int day = Integer.parseInt(parts[2]);
    return new DateOfBirth(year, month, day);
  }
  
  public String toString() {
    return year + "-" + month + "-" + day;
  }
}
