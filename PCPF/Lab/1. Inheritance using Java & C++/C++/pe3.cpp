#include <iostream>
using namespace std;

// Base class: Reverse
class Reverse
{
protected:
  string userString;
  string reversedString;

public:
  // Constructor to initialize userString
  Reverse(string userString) : userString(userString) {}

  // Function to reverse the string
  string reverseString(string data)
  {
    for (int i = 0; i < data.length(); i++)
    {
      reversedString += data[data.length() - i - 1];
    }
    return reversedString;
  }
};

// Derived class: Display (inherits from Reverse)
class Display : public Reverse
{
public:
  // Constructor to initialize userString through the base class constructor
  Display(string userString) : Reverse(userString) {}

  // Function to display the userString
  void print()
  {
    cout << "Original String: " << userString << endl;
  }
};

int main()
{
  string str;
  cout << endl<< "Enter a string: ";
  cin >> str;

  // Create a Display object
  Display display(str);

  // Call the print function to display the original string
  display.print();

  // Call the reverseString function from the base class and display the reversed string
  string reversed = display.reverseString(str);
  cout << "Reversed String: " << reversed << endl<<endl;

  return 0;
}
