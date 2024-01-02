import java.util.Scanner;

// Define a class called Rectangle
class Rectangle {
    // Constructor for the Rectangle class that calculates and prints the area
    public Rectangle(int length, int breadth) {
        // Calculate the area of the rectangle
        int area = length * breadth;
        
        // Print the area of the rectangle
        System.out.println("Area of Rectangle: " + area);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the length of the rectangle
        System.out.print("Enter the length: ");
        int length = sc.nextInt();

        // Prompt the user to enter the breadth of the rectangle
        System.out.print("Enter the breadth: ");
        int breadth = sc.nextInt();

        // Create an instance of the Rectangle class, passing the length and breadth as parameters
        Rectangle rect = new Rectangle(length, breadth);

        // Close the scanner to release resources
        sc.close();
    }
}
