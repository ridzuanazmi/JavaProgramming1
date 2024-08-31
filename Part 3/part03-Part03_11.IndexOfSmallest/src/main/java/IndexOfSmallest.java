
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    /*
    Write a program that reads numbers from the user. 
    When number 9999 is entered, the reading process stops. 
    After this the program will print the smallest number in the list, and also the indices where that number is found. 
    Notice: the smallest number can appear multiple times in the list.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        int smallest = list.get(0);
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < smallest || list.get(i) == smallest) {
                smallest = list.get(i);
                System.out.println("Found at index: " + i);
            }
        }
        System.out.println("Smallest number: " + smallest);
        
    }
}
