/* Write a program to print the names of students by creating a Student class. If no name is passed while creating an object
of Student class, then the name should be "Unknown", otherwise the name should be equal to the String value passed
while creating object of Student class. */

class Student {
    String name;
    Student() {this.name = "Unknown";}
    Student(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Student name: "+name);
    }
}
class Main{
    public static void main(String[] args){
        Student std1 = new Student();
        Student std2 = new Student("Ajaykumar");
        std1.display();
        std2.display();
    }
}