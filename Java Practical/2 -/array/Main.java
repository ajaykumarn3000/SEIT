// a) Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'.
import java.util.*;

class Employee {
    String name, address;
    int yoj;
   
    public void setDetail (String n, String a, int y) {
        this.name = n;
        this.address = a;
        this.yoj = y;
    }
}
class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner();
        Employee emp1 = new Employee();
        emp1.setDetail("Ajaykumar", "Borivali", 2003);
        Employee emp2 = new Employee();
        emp2.setDetail("Bianca   ", "Andheri", 2005);
        Employee emp3 = new Employee();
        emp3.setDetail("Mokshada ", "Hostel ", 2004);
       
        System.out.println("Name\t\tYear of Joining \t\tAddress\n");
        System.out.println(emp1.name+"\t\t"+emp1.yoj+"\t\t"+emp1.address+"\n");
        System.out.println(emp2.name+"\t\t"+emp2.yoj+"\t\t"+emp2.address+"\n");
        System.out.println(emp3.name+"\t\t"+emp3.yoj+"\t\t"+emp3.address+"\n");
       
    }
}