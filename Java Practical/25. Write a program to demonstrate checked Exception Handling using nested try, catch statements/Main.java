import java.lang.*;

// Define the main class
class Main {
    public static void main(String args[]) {
        try {
            // Attempt a division by zero, which will result in an ArithmeticException
            int i = 10/0;

        } catch (ArithmeticException e) {
            // Catch the ArithmeticException and print the exception details
            System.out.println("Caught ArithmeticException: " + e);

            // Attempt to access an element at an out-of-bounds index, which will result in an IndexOutOfBoundsException
            try {
                int[] num = {0, 1, 2};
                int b = num[4];
            } catch (IndexOutOfBoundsException f) {
                // Catch the IndexOutOfBoundsException and print the exception details
                System.out.println("Caught IndexOutOfBoundsException: " + f);
            }
        }
    }
}
