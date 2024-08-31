
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Write a program that prompts the user for a password. 
        If the password is "Caput Draconis" the program prints "Welcome!". Otherwise, the program prints "Off with you!"
        */
        // Write your program here 
        System.out.println("Password?");
        String pw = scan.nextLine();
        if ("Caput Draconis".equals(pw)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
