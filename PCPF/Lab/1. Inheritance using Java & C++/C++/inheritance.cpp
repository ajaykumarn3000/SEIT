// 1. Write a program in C++ to implement single inheritance. Derive class typist class
// from class staff. Public members of class staff such as staff::getdata() and staff::display()
// are inherited to class typist. Access the member functions using objects of derived class.

#include <iostream>
using namespace std;

// Base class
class Staff {
	struct Data
	{
		int pid;
		char name[100];
		float salary;
	} ajay;

	public:
		void getdata()
		{
			ajay = {221077, "Ajay", 100000.00};
		}
		void display()
		{
			cout << "PID no: " << ajay.pid << endl;
			cout << "Name: " << ajay.name << endl;
			cout << "Salary: " << ajay.salary << endl;
		}
};

class Typist : public Staff {
	public:
		void print()
		{

			Staff staff;
			staff.getdata();
			staff.display();
		}
};

int main() {
	Typist typer;
	typer.print();
	return 0;
}