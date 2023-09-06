class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void getDetails() {
    System.out.println("Name: " + name + "\nAge: " + age);
    System.out.println("");
  }
}

class Teacher extends Person {
  int employeeID;
  int experience;

  Teacher(String name, int age, int employeeID, int experience) {
    super(name, age);
    this.employeeID = employeeID;
    this.experience = experience;
  }

  void getDetails() {
    super.getDetails();
    System.out.println("Employee ID: " + employeeID + "\nExperience: " + experience);
    System.out.println("");
  }
}

class HOD extends Teacher {
  String department;

  HOD(String name, int age, int employeeID, int experience, String department) {
    super(name, age, employeeID, experience);
    this.department = department;
  }

  void getDetails() {
    super.getDetails();
    System.out.println("Department: " + department);
    System.out.println("");
  }
}

public class Main {
  public static void main(String[] args) {
    Teacher priyankaMaam = new Teacher("Ms. Priyanka Patil", 25, 123, 3);
    priyankaMaam.getDetails();

    HOD prachiMaam = new HOD("Ms.Prachi Raut", 45, 100, 20, "INFT");
    prachiMaam.getDetails();
  }
}
