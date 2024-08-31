
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Write a program that reads an integer from the user and prints the square of the given integer, 
        i.e. the integer multiplied by itself.
        */
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println(num * num);

    }
}
