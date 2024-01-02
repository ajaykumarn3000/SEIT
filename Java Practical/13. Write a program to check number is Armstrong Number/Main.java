import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int temp = num;
        int save = 0;
        int a;

        // Calculate the sum of cubes of individual digits in the number
        while (temp != 0) {
            a = temp % 10;     // Get the last digit
            save += a * a * a; // Add the cube of the digit to the sum
            temp /= 10;        // Remove the last digit
        }

        // Check if the sum of cubes is equal to the original number
        if (save == num) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
