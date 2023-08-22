//Implement a java program to calculate gross salary & net salary taking the
//following data. Input: empno, empname,basic salary. Process:DA=70% of
//basic,HRA=30% of basic,CCA=Rs240/-,PF=10% of basic,PT=Rs100/-

import java.util.Scanner;

class Salary {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee Number: ");
		int empno = sc.nextInt();

		System.out.println("Enter Employee Name: ");
		String empname = sc.next();

		System.out.println("Enter Employee Salary");
		double basicSalary = sc.nextDouble();

		double DA = 0.7*basicSalary;
        double HRA = 0.3*basicSalary;
        double CCA = 240;
        double PF = 0.1*basicSalary;
        double PT = 100;
        double grossSalary = basicSalary+DA+HRA+CCA;
        double netSalary = grossSalary-PF-PT;

        System.out.println("Employee no: "+empno+"\nEmployee Name: "+empname+"\nGross Salary: "+grossSalary+"\nNet Salary: "+netSalary);
		
}
}