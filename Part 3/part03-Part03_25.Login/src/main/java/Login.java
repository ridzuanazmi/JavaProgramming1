
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] users = {"alex", "emma"};
        String[] passwords = {"sunshine", "haskell"};

        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String pw = scanner.nextLine();

        boolean loggedIn = false;
        // Check if the entered username and password match any of the predefined pairs
        for (int i = 0; i < users.length; i++) {
            if (username.equals(users[i]) && pw.equals(passwords[i])) {
                loggedIn = true;
                break;
            }
        }

        if (loggedIn) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
