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

        // Check which number is the largest using if-else statements
        if (a > b) {
            // If 'a' is greater, print it as the largest number
            System.out.println("The largest number is: " + a);
        } else {
            // If 'b' is greater or equal to 'a', print 'b' as the largest number
            System.out.println("The largest number is: " + b);
        }

        // Close the scanner to release resources
        sc.close();
    }
}
