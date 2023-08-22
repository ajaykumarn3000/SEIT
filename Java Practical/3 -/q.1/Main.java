/* a) Write a program to implement Constructor chaining.   */

class Person {
  int id;
  String name;
  int age;

  Person(int id_p, String name_p, int age_p) {
    id = id_p;
    name = name_p;
    age = age_p;
  }

  Person(int id_p) {
    this(id_p, "noName", 20);
  }

  Person(int id_p, String name_p) {
    this(id_p, name_p, 20);
  }

  Person(int id_p, int age_p) {
    this(id_p, "noName", age_p);
  }

  void display() {
    System.out.println("ID: " + id + "\nName: " + name + "\nAge: " + age + "\n");
  }
}

public class Main {
  public static void main(String[] args) {
    Person p1 = new Person(1, "Ajay", 19);
    p1.display();
    Person p2 = new Person(2, "Kevin");
    p2.display();
    Person p3 = new Person(3, 18);
    p3.display();
    Person p4 = new Person(4);
    p4.display();
  }
}
