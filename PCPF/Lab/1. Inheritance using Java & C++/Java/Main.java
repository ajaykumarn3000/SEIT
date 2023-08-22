// 3. Write a program in Java to implement hierarchical inheritance. Create
// PermanentEmp class and TemporaryEmp class as the subclasses. Create class Employee
// as the super class that defines the salary of an employee. Class PermanentEmp has a hike
// of 35% of the amount defined in class Employee and Class TemporaryEmp has a hike of
// 20% of the amount defined in class Employee. Access the member functions using
// objects of derived class. 

class Employee {
  protected double salary;

  public Employee(double salary) {
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }
}

class PermanentEmp extends Employee {
  public PermanentEmp(double salary) {
    super(salary);
  }

  public double getHike() {
    return salary * 0.35; // 35% hike
  }
}

class TemporaryEmp extends Employee {
  public TemporaryEmp(double salary) {
    super(salary);
  }

  public double getHike() {
    return salary * 0.20; // 20% hike
  }
}

public class Main {
  public static void main(String[] args) {
    // Create PermanentEmp object
    PermanentEmp permanentEmployee = new PermanentEmp(50000);

    // Create TemporaryEmp object
    TemporaryEmp temporaryEmployee = new TemporaryEmp(30000);

    // Access the member functions using objects of derived classes
    double permanentSalary = permanentEmployee.getSalary();
    double permanentHike = permanentEmployee.getHike();

    double temporarySalary = temporaryEmployee.getSalary();
    double temporaryHike = temporaryEmployee.getHike();

    System.out.println("Permanent Employee Salary: $" + permanentSalary);
    System.out.println("Permanent Employee Hike: $" + permanentHike);
    System.out.println("Temporary Employee Salary: $" + temporarySalary);
    System.out.println("Temporary Employee Hike: $" + temporaryHike);
  }
}
