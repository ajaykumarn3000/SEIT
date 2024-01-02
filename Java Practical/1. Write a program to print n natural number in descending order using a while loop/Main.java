import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Create a Scanner object for user input
    Scanner sc = new Scanner(System.in);
    
    // Prompt the user to enter a number
    System.out.print("Enter a number:");
    
    // Read an integer from the user's input and store it in the variable 'n'
    int n = sc.nextInt();

    // Use a while loop to print numbers from 'n' down to 1
    while (n > 0) {
      System.out.println(n);  // Print the current value of 'n'
      n--;                   // Decrement the value of 'n' by 1
    }

    // Close the Scanner to release system resources
    sc.close();
  }
}
