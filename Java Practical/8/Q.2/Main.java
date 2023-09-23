// Write a Java Program to calculate the Result. Result should consist of name, seatno, date, centre number and 
// marks of sem-2 examination. Create a user defined exception class MarksOutOfBoundsException, If Entered marks 
// of any subject is greater than 100 or less than 0, and then program should create a user defined Exception of
// type MarksOutOfBoundsException and must have a provision to handle it.

import java.util.Scanner;

class MarksOutOfBoundsException extends Exception {
  public MarksOutOfBoundsException(String message) {
    super(message);
  }
}

class Sem2Result {
  String name;
  int seatNo;
  String date;
  int centerNo;
  int marks;

  Sem2Result(String name, int seatNo, String date, int centerNo, int marks) {
    this.name = name;
    this.seatNo = seatNo;
    this.date = date;
    this.centerNo = centerNo;
    this.marks = marks;
  }

  void display() {
    System.out.println("Result Details:");
    System.out.println("Name: " + name);
    System.out.println("Seat No: " + seatNo);
    System.out.println("Date: " + date);
    System.out.println("Center Number: " + centerNo);
    System.out.println("Semester 2 Marks: " + marks);
  }
}

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Marks: ");
    int marks = sc.nextInt();
    try {
      Sem2Result studentResult = new Sem2Result("Ajaykumar Nadar", 123456, "2023-09-22", 001, marks);
      if (studentResult.marks < 0 || studentResult.marks > 100) {
        throw new MarksOutOfBoundsException("Marks out of bounds (0-100): " + studentResult.marks);
      }
      studentResult.display();
    } catch (MarksOutOfBoundsException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
