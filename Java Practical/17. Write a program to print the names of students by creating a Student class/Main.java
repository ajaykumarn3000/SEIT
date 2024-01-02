/* 
   17. Write a program to print the names of students by creating a Student class.
   If no name is passed while creating an object of Student class, then the name should be "Unknown",
   otherwise, the name should be equal to the String value passed while creating an object of Student class (use constructor concept).
*/

// Define a Student class
class Student {
    String name;

    // Constructor with a parameter to set the name
    public Student(String n) {
        name = n;
    }

    // Default constructor with no parameters to set the name to "Unknown"
    public Student() {
        name = "Unknown";
    }

    // Method to print the name of the student
    void getName() {
        System.out.println("Name: " + name);
    }
}

class Main {
    public static void main(String[] args) {
        // Create instances of the Student class with and without passing a name
        Student stu1 = new Student("Ajaykumar");
        stu1.getName();

        Student stu2 = new Student();
        stu2.getName();
    }
}
