import java.util.Scanner;

class Main {
    // A function to calculate the area of a circle based on its radius
    static double areaOfCircle(double radius) {
        double area = 3.14 * radius * radius; // Calculate the area using the formula πr^2
        return area; // Return the calculated area
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius: ");

        // Read the user's input as a double and store it in the 'r' variable
        double r = sc.nextDouble();

        // Call the 'areaOfCircle' function to calculate the area
        double a = areaOfCircle(r);

        // Display the calculated area
        System.out.println("Area = " + a);

        // Close the Scanner to release system resources
        sc.close();
    }
}
