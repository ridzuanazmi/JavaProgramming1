
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {
    /*
    Expand the program to ask for a start and end indices once it has finished asking for numbers. 
    After this the program shall prints all the numbers in the list that fall in the specified range (between the indices given by the user, inclusive). 
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        
        System.out.println("From where?");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.println("To where?");
        int end = Integer.valueOf(scanner.nextLine());
        System.out.println(numbers.get(start));
        System.out.println(numbers.get(end));

    }
}
