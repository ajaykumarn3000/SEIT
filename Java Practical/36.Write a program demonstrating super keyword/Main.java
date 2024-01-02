// Define a User class with username and password
class User {
    protected String name, password;

    // Constructor to initialize user details
    User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    // Method to get and print user details
    void getData() {
        System.out.println("Username: " + name);
        System.out.println("Password: " + password);
    }
}

// Define an Admin class that extends User
class Admin extends User {
    // Constructor to initialize admin details
    Admin(String name, String password) {
        super(name, password);
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        // Create an Admin object with a username and password
        Admin admin1 = new Admin("ajaykumar", "1234");

        // Display the admin's user details using the inherited method
        admin1.getData();
    }
}
