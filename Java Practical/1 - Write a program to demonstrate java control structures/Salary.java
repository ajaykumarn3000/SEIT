import java.util.Scanner;

public class Salary {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Name");
    String name = sc.next();

    System.out.println("Enter Emp Number");
    int erpno = sc.nextInt();

    System.out.println("Enter Basic  Salary");
    double basicSalary = sc.nextDouble();
    
    double DA = 0.7 * basicSalary;
    double HRA = 0.3 * basicSalary;
    double CCA = 240;
    double PF = 0.1 * basicSalary;
    double PT = 100;
    double gross_sal = basicSalary + DA + HRA + CCA;
    double net_sal = gross_sal - PF - PT;

    System.out.println("The gross salary is " + gross_sal);
    System.out.println("The net salary is " + net_sal);

    sc.close();
  }
}