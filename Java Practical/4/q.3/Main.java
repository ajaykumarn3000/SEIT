// Author - Ajaykumar Nadar

class Employee {
  int employeeId;
  String employeeName;

  Employee(int employeeId, String employeeName) {
    this.putData(employeeId, employeeName);
  }
  Employee(){
    System.out.print("Waring: No Employee data found\n");
    System.out.print("Set Employee data using .putData() method\n");
  }

  void getData() {
    System.out.print("Emp Id: " + employeeId + "\nEmp Name: " + employeeName +"\n");
  }

  void putData(int employeeId, String employeeName) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;
  }
}
class Salary extends Employee {
  float basicPay;
  float HRA;
  float DA;
  float CLA;

  Salary (int employeeId, String employeeName, float basicPay, float HRA, float DA, float CLA) {
    super(employeeId, employeeName);
    this.basicPay = basicPay;
    this.HRA = HRA;
    this.CLA = CLA;
    this.DA = DA;
  }
  Salary (float basicPay, float HRA, float DA, float CLA) {
    this.basicPay = basicPay;
    this.HRA = HRA;
    this.CLA = CLA;
    this.DA = DA;
  }

  void calculateSalary(){
    float gross_sal = basicPay + DA + HRA + CLA;
    getData();
    System.out.print("Gross Salary: " + gross_sal);
  }
}
class Main {
  public static void main(String[] args) {
    Salary emp1 = new Salary(105, "Ajaykumar Nadar", 1110, 111110, 10, 10);
    emp1.calculateSalary();
  }
}
