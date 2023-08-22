/* 1. Implement a program in Java to calculate the area of a rectangle, a square and a circle.
Create an abstract superclass 'Shape' with three abstract methods namely 'RectangleArea'
taking two parameters and 'SquareArea' and 'CircleArea' taking one parameter each. The
parameters of 'RectangleArea' are its length and breadth. The parameters of 'SquareArea'
is its side and that of 'CircleArea' is its radius. Also create subclass ‘area’. Apply the
concept of data abstraction to access the methods of the superclass by creating the object
of subclass.  */

import java.lang.Math;

abstract class Shape {
  abstract int RectangleArea(int x, int y);
  abstract int SquareArea(int s);
  abstract double CircleArea(int r);
}

class Area extends Shape {
  public int RectangleArea(int x, int y) {
    return x * y;
  }
  public int SquareArea(int s) {
    return s * s;
  }
  public double CircleArea(int r) {
    return (2 * Math.PI * r);
  }
}

public class Main {
  public static void main(String[] args) {
    Area area = new Area();
    System.out.println("Area of 2x4 Rectangle: " + area.RectangleArea(2, 4));
    System.out.printf("Area of r(2) Circle: %.02f", area.CircleArea(2));
  }
}
