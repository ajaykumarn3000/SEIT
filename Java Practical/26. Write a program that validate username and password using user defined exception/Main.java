import java.lang.Exception;
import java.util.Scanner;

// Define a custom exception for a username not found situation
class UsernameNotFoundException extends Exception {
    UsernameNotFoundException(String message) {
        super(message);
    }
}

// Define a custom exception for an incorrect password situation
class IncorrectPasswordException extends Exception {
    IncorrectPasswordException(String message) {
        super(message);
    }
}

// Define a User class to represent a user with a username and password
class User {
    protected String username;
    protected String password;

    // Constructor to initialize the username and password
    User(String user, String pass) {
        username = user;
        password = pass;
    }

    // Method to authorize a user by comparing the provided username and password
    void authorize(String u, String p) {
        try {
            if (u.equals(username)) { // Check if the provided username matches
                try {
                    if (p.equals(password)) { // Check if the provided password matches
                        System.out.println("Authorization Successful");
                    } else {
                        throw new IncorrectPasswordException("Password doesn't match");
                    }
                } catch (IncorrectPasswordException f) {
                    System.out.println(f);
                }
            } else {
                throw new UsernameNotFoundException("Username not found");
            }
        } catch (UsernameNotFoundException e) {
            System.out.println(e);
        }
    }
}

// Define the main class
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Create a User instance with a predefined username and password
        User u1 = new User("ajaykumar", "1234567");

        System.out.print("Enter username: ");
        String name = sc.nextLine();

        System.out.print("Enter password: ");
        String key = sc.nextLine();

        // Authorize the user by checking the provided username and password
        u1.authorize(name, key);
    }
}
