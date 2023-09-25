// Write java program where user will enter loginid and password as input. The password should be 8 digit
// containing one digit and one special symbol. If user enter valid password satisfying above criteria then 
// show Login Successful Message. If user enter invalid Password then create InvalidPasswordException stating
// Please enter valid password of length 8 containing one digit and one Special Symbol

import java.util.Scanner;
import java.lang.Character;

class InvalidPasswordException extends Exception {
  public InvalidPasswordException(String message) {
    super(message);
  }
}

class User {
  private String loginid;
  private String password;

  void login(String loginid, String password) {
    if (this.passwordChecker(password)) {
      this.loginid = loginid;
      this.password = password;
      System.out.println("Login Successful");
    }
    else {
      System.out.println("Login failed");
    }
  }

  boolean passwordChecker(String password) {
    try {
      if (password.length() < 8) {
        throw new InvalidPasswordException("Password must contain minimum 8 characters.");
      }
      boolean isDigit = false;
      boolean isSymbol = false;
      for (int i = 0; i < password.length(); i++) {
        if (Character.isDigit(password.charAt(i))) {
          isDigit = true;
        } else if (!Character.isLetter(password.charAt(i)) && !Character.isWhitespace(password.charAt(i))) {
          isSymbol = true;
        }
      }
      if (!isDigit) {
        throw new InvalidPasswordException("Password must contain a digit");
      }
      else if (!isSymbol) {
        throw new InvalidPasswordException("Password must contain a symbol.");
      }
      else {
        return true;
      }
    } catch (InvalidPasswordException e) {
      System.out.println("Error: " + e.getMessage());
      return false;
    }

  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Login ID: ");
    String id = sc.next();
    System.out.print("Enter the password: ");
    String password = sc.next();

    User user = new User();
    user.login(id, password); 
  }
}
