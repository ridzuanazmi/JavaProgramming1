
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        > greater than
        >= greater than or equal to
        < less than
        <= less than or equal to
        == equal to
        != not equal to
        */
        // Write your program here
        System.out.println("Give a number:");
        int num1 = Integer.valueOf(scan.nextLine());
        if (num1 == 1984) {
            System.out.println("Orwell");
        }
    }   
}
