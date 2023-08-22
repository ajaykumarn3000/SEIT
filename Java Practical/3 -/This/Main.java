/* b) Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First
method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea'
returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard. */

import java.util.Scanner;

class Area {
    int area, length, breadth;
    void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    int getArea() {
        this.area = length*breadth;
        return area;
    }
}
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int breadth = sc.nextInt();
        Area areaCalc = new Area();
        areaCalc.setDim(length, breadth);
        System.out.printf("Area: %d", areaCalc.getArea());
        sc.close();
    }
}