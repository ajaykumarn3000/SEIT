import java.util.Scanner;
import java.lang.Math;

public class AllInOne {
  public static void main(String[] arg) {

    // Opetation menu
    Scanner sc = new Scanner(System.in);
    System.out.println(
        "Choose a operation: \n 1. Factorial\n 2. Reverse of a Number\n 3. Test Armstrong\n 4. Test Palindrome\n 5. Test Prime\n 6. Fibonacci Series");
    int operation = sc.nextInt();
    int num;
    switch (operation) {

      // Factorial()
      case 1:
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        int factorial = 1;
        for (int i = num; i > 0; i--) {
          factorial *= i;
        }
        System.out.println("The Factorial is: " + factorial);
        break;

      // Reverse of a Number()
      case 2:
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        int reverse = 0;
        for (int j = num; j > 0; j /= 10) {
          reverse = ((10 * reverse) + (j % 10));
        }
        System.out.println("The Reverse is: " + reverse);
        break;

      // Test Armstrong()
      case 3:
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        int cube = 0;
        for (int k = num; k > 0; k /= 10) {
          cube += Math.pow(k % 10, 3);
        }
        if (cube == num) {
          System.out.println(num + " is a Armstrong Number");
        } else {
          System.out.println(num + " is not a Armstrong Number");
        }
        break;

      // Test Palindrome()
      case 4:
        System.out.println("Enter a string: ");
        String str = sc.next();
        int len = str.length();
        int palindrome = 1;
        for (int i = 0; i < len / 2; i++) {
          if (str.charAt(i) != str.charAt(len - 1)) {
            palindrome = 0;
            break;
          }
        }
        if (palindrome == 1) {
          System.out.println("The string " + str + " is PALINDROME");
        } else {
          System.out.println("The string " + str + " is NOT PALINDROME");
        }

        break;

      // Error
      default:
        System.out.println("Opertion Not Available");
        break;
    }
    sc.close();
  }
}