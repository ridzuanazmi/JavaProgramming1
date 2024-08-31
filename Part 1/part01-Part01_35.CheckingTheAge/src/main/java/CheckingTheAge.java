
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        The expression of a conditional statement may consist of multiple parts, 
        in which the logical operators and &&, or ||, and not ! are used.
        
        Write a program that prompts the user to input their age and checks whether or not it is possible (at least 0 and at most 120). 
        Only use a single if-command in your program.
        */
        System.out.println("How old are you? ");
        int age = Integer.valueOf(scan.next());
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
