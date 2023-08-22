
/* 3. Print the sum, difference and product of two complex numbers by creating a class named 'Complex' 
with separate methods for each operation whose real and imaginary parts are entered by user.  */

import java.lang.Math;
import java.util.Scanner;

class Complex {
  int real;
  int imaginary;
  int z_real, z_img;
  
  void sum(int x1, int y1, int x2, int y2) {
    System.out.printf("%d + i%d", (x1 + x2), (y1 + y2));
  }

  void difference(int x1, int y1, int x2, int y2) {
    System.out.printf("%d + i%d", Math.abs(x1 - x2), Math.abs(y1 - y2));
  }

  void product(int x1, int y1, int x2, int y2) {
    System.out.printf("%d + i%d", (x1 * x2 - y1 * y2), (x1 * y2 + x2 * y1));
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Complex z = new Complex();

    System.out.println("Choose a operation:\n\t1.Sum\n\t2.Difference\n\t3.Product");
    int choice = sc.nextInt();

    System.out.printf("1st Complex no.\n\tEnter real number: ");
    int real1 = sc.nextInt();
    System.out.printf("\tEnter Imaginary number: ");
    int imag1 = sc.nextInt();

    System.out.printf("2nd Complex no.\n\tEnter real number: ");
    int real2 = sc.nextInt();
    System.out.printf("\tEnter Imaginary number: ");
    int imag2 = sc.nextInt();

    switch (choice) {
      case 1:
        z.sum(real1, imag1, real2, imag2);
        break;
      case 2:
        z.difference(real1, imag1, real2, imag2);
        break;
      case 3:
        z.product(real1, imag1, real2, imag2);
        break;
      default:
        System.out.println("Error 404: Operation not found");
        break;
    }
    sc.close();
  }
}
