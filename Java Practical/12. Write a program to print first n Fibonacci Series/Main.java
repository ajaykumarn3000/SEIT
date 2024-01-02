import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            // If the number is less than or equal to 0, do nothing (no output)
        } else if (num == 1) {
            // If the number is 1, print "0"
            System.out.print("0");
        } else if (num == 2) {
            // If the number is 2, print "0 1"
            System.out.print("0 1");
        } else {
            // For numbers greater than 2, generate a Fibonacci sequence
            int a = 0, b = 1, temp;
            System.out.print("0 1 "); // Initial values of the Fibonacci sequence
            for (int i = 0; i < num - 2; i++) {
                temp = b;
                b = a + b;
                a = temp;
                System.out.print(b + " "); // Print the next value in the sequence
            }
        }

        // Close the scanner to release resources
        sc.close();
    }
}
