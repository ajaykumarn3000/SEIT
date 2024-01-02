import java.util.Scanner;

// Define a class called Area
class Area {
    // Method to calculate and return the area of a circle
    double calculateArea(double radius) {
        double area = 3.14 * radius * radius;
        return area;
    }

    // Method to calculate and return the area of a rectangle
    int calculateArea(int length, int breadth) {
        int area = length * breadth;
        return area;
    }

    // Method to calculate and return the area of a triangle
    double calculateArea(double height, double base) {
        double area = (base * height) / 2;
        return area;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an instance of the Area class
        Area a = new Area();

        // Prompt the user to choose a shape to calculate the area for
        System.out.println("1. Circle\n2. Rectangle\n3. Triangle\nCalculate area of: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // For a circle, input the radius and calculate the area
                System.out.print("Enter the radius: ");
                double r = sc.nextDouble();
				
                double circleArea = a.calculateArea(r);
                System.out.println("Area = " + circleArea);
                break;

            case 2:
                // For a rectangle, input the length and breadth and calculate the area
                System.out.print("Enter the length: ");
                int l = sc.nextInt();
                System.out.print("Enter the breadth: ");
                int b = sc.nextInt();
				
                int rectArea = a.calculateArea(l, b);
                System.out.println("Area = " + rectArea);
                break;

            case 3:
                // For a triangle, input the height and base and calculate the area
                System.out.print("Enter the height: ");
                double h = sc.nextDouble();
                System.out.print("Enter the base: ");
                double base = sc.nextDouble();
				
                double triArea = a.calculateArea(h, base);
                System.out.println("Area = " + triArea);
                break;

            default:
                System.out.println("Invalid Operation"); // Print this message for an invalid choice
                break;
        }

        // Close the scanner to release resources
        sc.close();
    }
}
