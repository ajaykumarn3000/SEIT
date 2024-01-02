// Define a Student class
class Student {
    int pid, age;
    String name;

    // Constructor with three parameters to initialize PID, name, and age
    public Student(int sPid, String sName, int sAge) {
        pid = sPid;
        name = sName;
        age = sAge;
    }

    // Constructor with only PID and uses default values for name and age
    public Student(int sPid) {
        this(sPid, "noName", 19);
    }

    // Constructor with PID and name, and uses a default age
    public Student(int sPid, String sName) {
        this(sPid, sName, 19);
    }

    // Constructor with PID and age, and uses a default name
    public Student(int sPid, int sAge) {
        this(sPid, "noName", sAge);
    }

    // Method to print the details of a student
    void getDetails() {
        System.out.println("PID: " + pid);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        // Create instances of the Student class with different constructors
        Student stu1 = new Student(221077, "Ajaykumar", 20);
        stu1.getDetails();

        Student stu2 = new Student(221078, "Kevin");
        stu2.getDetails();

        Student stu3 = new Student(221080, 18);
        stu3.getDetails();

        Student stu4 = new Student(201010);
        stu4.getDetails();
    }
}
