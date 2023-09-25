// Importing the static members of the Math class

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        double radius = 5.0;
        
        // Using static imports to directly access static methods and constants
        double area = PI * pow(radius, 2);
        double circumference = 2 * PI * radius;
        
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
