// 2. Write a program in C++ to implement multiple inheritance. Create class Rectangle
// having two parent classes Area and Perimeter. Class 'Area' has a function getArea(int l,
// int b) which returns area. Class 'Perimeter' has a function getPerimeter (int l, int b) which
// returns the perimeter. Access the member functions using objects of derived class.

#include <iostream>
using namespace std;

// Area class with a function to calculate area
class Area
{
public:
  int getArea(int l, int b)
  {
    return l * b;
  }
};

// Perimeter class with a function to calculate perimeter
class Perimeter
{
public:
  int getPerimeter(int l, int b)
  {
    return 2 * (l + b);
  }
};

// Rectangle class inheriting from Area and Perimeter
class Rectangle : public Area, public Perimeter
{
public:
};

int main()
{
  int length, breadth;
  cout << "Enter the length of the rectangle: ";
  cin >> length;
  cout << "Enter the breadth of the rectangle: ";
  cin >> breadth;

  Rectangle rect;

  int area = rect.getArea(length, breadth);
  int perimeter = rect.getPerimeter(length, breadth);

  cout << "Area of the rectangle: " << area << endl;
  cout << "Perimeter of the rectangle: " << perimeter << endl;

  return 0;
}
