// 3. Write a program in Java to implement hierarchical inheritance. Create
// PermanentEmp class and TemporaryEmp class as the subclasses. Create class Employee
// as the super class that defines the salary of an employee. Class PermanentEmp has a hike
// of 35% of the amount defined in class Employee and Class TemporaryEmp has a hike of
// 20% of the amount defined in class Employee. Access the member functions using
// objects of derived class. 

#include <iostream>
using namespace std;

class Employee {
protected:
    double salary;

public:
    Employee(double salary) : salary(salary) {}

    double getSalary() {
        return salary;
    }
};

class PermanentEmp : public Employee {
public:
    PermanentEmp(double salary) : Employee(salary) {}

    double getHike() {
        return salary * 0.35; // 35% hike
    }
};

class TemporaryEmp : public Employee {
public:
    TemporaryEmp(double salary) : Employee(salary) {}

    double getHike() {
        return salary * 0.20; // 20% hike
    }
};

int main() {
    // Create PermanentEmp object
    PermanentEmp permanentEmployee(50000);

    // Create TemporaryEmp object
    TemporaryEmp temporaryEmployee(30000);

    // Access the member functions using objects of derived classes
    double permanentSalary = permanentEmployee.getSalary();
    double permanentHike = permanentEmployee.getHike();

    double temporarySalary = temporaryEmployee.getSalary();
    double temporaryHike = temporaryEmployee.getHike();

    cout << "Permanent Employee Salary: $" << permanentSalary << endl;
    cout << "Permanent Employee Hike: $" << permanentHike << endl;
    cout << "Temporary Employee Salary: $" << temporarySalary << endl;
    cout << "Temporary Employee Hike: $" << temporaryHike << endl;

    return 0;
}
