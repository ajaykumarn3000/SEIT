import java.util.Scanner;

// Custom exception class for handling marks out of bounds
class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String message) {
        super(message);
    }
}

// Class to store and display Semester 2 results
class Sem2Result {
    String name;
    int seatNo;
    String date;
    int centerNo;
    int marks;

    // Constructor to initialize result details
    Sem2Result(String name, int seatNo, String date, int centerNo, int marks) {
        this.name = name;
        this.seatNo = seatNo;
        this.date = date;
        this.centerNo = centerNo;
        this.marks = marks;
    }

    // Method to display result details
    void display() {
        System.out.println("Result Details:");
        System.out.println("Name: " + name);
        System.out.println("Seat No: " + seatNo);
        System.out.println("Date: " + date);
        System.out.println("Center Number: " + centerNo);
        System.out.println("Semester 2 Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Marks: ");
        int marks = sc.nextInt();
        try {
            // Create a Sem2Result object with sample details
            Sem2Result studentResult = new Sem2Result("Ajaykumar Nadar", 123456, "2023-09-22", 001, marks);

            // Check if the marks are within the valid range (0-100)
            if (studentResult.marks < 0 || studentResult.marks > 100) {
                throw new MarksOutOfBoundsException("Marks out of bounds (0-100): " + studentResult.marks);
            }

            // Display the result
            studentResult.display();
        } catch (MarksOutOfBoundsException e) {
            // Handle the custom exception for out-of-bounds marks
            System.out.println("Error: " + e.getMessage());
        }
    }
}
