import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a day represented as an integer
        System.out.print("Enter day: ");
        int day = sc.nextInt();

        // Use a switch statement to determine the corresponding day of the week based on the user's input
        switch (day) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Invalid number"); // Print this message for any number other than 1-7
                break;
        }

        // Close the scanner to release resources
        sc.close();
    }
}
