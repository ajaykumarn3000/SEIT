/* b) Write a program to print the area of a rectangle by creating a class named 'Area'
 having two methods. First method named as 'setDim' takes length and breadth of rectangle
 as parameters and the second method named as 'getArea' returns the area of the rectangle.
 Length and breadth of rectangle are entered through keyboard. */

import java.util.Scanner;

class Area {
  int length, breadth;

  void setDim(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  int getArea() {
    return (length * breadth);
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter length: ");
    int l = scanner.nextInt();
    System.out.println("Enter breadth: ");
    int b = scanner.nextInt();

    Area areaCalc = new Area();
    areaCalc.setDim(l, b);
    System.out.println("Area: " + areaCalc.getArea());
  }
}
