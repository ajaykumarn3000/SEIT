import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Prompt the user to enter a year
    System.out.print("Enter the year: ");
    
    // Read the user's input as an integer and store it in the 'year' variable
    int year = sc.nextInt();

    // Check if the entered year is a leap year
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          // If the year is divisible by 400, it's a leap year
          System.out.println("Leap Year");
        } else {
          // If the year is divisible by 4, divisible by 100 and not divisible by 100, it's not a leap year
          System.out.println("Not Leap Year");
        }
      } else {
        // If the year is divisible by 4 but not divisible by 100, it's a leap year
        System.out.println("Leap Year");
      }
    } else {
      // If the year is not divisible by 4, it's not a leap year
      System.out.println("Not Leap Year");
    }
    
    // Close the Scanner to release system resources
    sc.close();
  }
}
