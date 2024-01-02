import java.util.Scanner;

// Define a User class
class User {
    protected String name, password;

    // Constructor to initialize user details
    User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    // Method to get and print user details
    void getDetails() {
        System.out.println("Username: " + name);
        System.out.println("Password: " + password);
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a username
        System.out.print("Enter username: ");
        String name = sc.nextLine();
        
        // Prompt the user to enter a password
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        
        // Create a User object with the provided username and password
        User u1 = new User(name, password);
        
        // Display the user details
        u1.getDetails();
    }
}
