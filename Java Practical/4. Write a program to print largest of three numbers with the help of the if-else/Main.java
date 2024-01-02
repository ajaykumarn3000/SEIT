import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the first number
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        
        // Prompt the user to enter the second number
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        
        // Prompt the user to enter the third number
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();
        
        // Check which number is the largest using if-else statements
        if (a > b && a > c) {
            System.out.println("The largest number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("The largest number is: " + b);
        } else {
            System.out.println("The largest number is: " + c);
        }
        
        // Close the scanner to release resources
        sc.close();
    }
}
