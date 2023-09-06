// 1.An employee works in a particular department of an organization. Every employee
// has an employee number, name and draws a particular salary. Every department has a name and a
// head of department. The head of department is an employee. Every year a new head of
// department takes over. Also, every year an employee is given an annual salary enhancement.
// Identify and design the classes for the above description with suitable instance variables and
// methods. Use Concept of Method Overloading

class Employee {
  int eid;
  String ename;
  float esalary;

  Employee(int id, String name, float salary) {
    eid = id;
    ename = name;
    esalary = salary;
  }
  Employee(int id, String name) {
    eid = id;
    ename = name;
    esalary = 30000;
  }

  void getDetails() {
    System.out.println("Employee ID: " + eid + "\nName: " + ename + "\nSalary: " + esalary + "\n");
  }
  void annualIncrement(int percentage) {
    System.out.print("Employee Name: "+ename+"\nSalary Increment: "+esalary+" -> ");
    esalary = esalary + (esalary * percentage/100);
    System.out.println(esalary + "\n");
  }
}

class Department {
  String dname;
  Employee dHOD;
  Department(String name, Employee HOD) {
    dname = name;
    dHOD = HOD;
  }

  void getHODDetails(){
    System.out.println("HOD Details:");
    dHOD.getDetails();
  }
  void HODSalaryIncrement(int percentage) {
    dHOD.annualIncrement(percentage);
  }
  void changeHOD(Employee newHOD) {
    dHOD = newHOD;
  }
}

public class Main {
  public static void main(String[] args) {
    Employee mrinmoyeeMaam = new Employee(1, "Ms. Mrinmoyee Mukherjee", 70000);
    Employee priyankaMaam = new Employee(2, "Ms. Priyanka Patil");
    Employee prachiMaam = new Employee(3, "Ms. Prachi Raut", 50000);
    
    mrinmoyeeMaam.getDetails();
    prachiMaam.getDetails();
    priyankaMaam.getDetails();
    priyankaMaam.annualIncrement(15);

    Department INFT = new Department("INFT", prachiMaam);
    INFT.getHODDetails();
    INFT.HODSalaryIncrement(20);

    INFT.changeHOD(mrinmoyeeMaam);
    INFT.getHODDetails();
  }
}
