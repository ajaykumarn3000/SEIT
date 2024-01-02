import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the lower limit
        System.out.print("Enter the lower limit: ");
        int l = sc.nextInt();

        // Prompt the user to enter the upper limit
        System.out.print("Enter the upper limit: ");
        int u = sc.nextInt();

        int flag;

        // Iterate through the numbers from the lower limit to the upper limit
        for (int i = l; i <= u; i++) {
            flag = 0;

            // Check for prime numbers using a nested loop
            for (int j = 2; j <= i / 2 && flag == 0; j++) {
                if (i % j == 0) {
                    flag = 1;
                    // If the number is divisible by any number from 2 to half of itself, it's not prime, set flag to 1
                }
            }

            // If flag is 0, the number is prime, so print it
            if (flag == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
