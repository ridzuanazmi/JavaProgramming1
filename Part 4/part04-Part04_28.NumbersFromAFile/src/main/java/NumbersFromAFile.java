
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            
            while (fileScanner.hasNextLine()) {
                numbers.add(Integer.valueOf(fileScanner.nextLine()));
            }
            
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
            System.out.println("Error: " + e.getMessage());
        }
        
        int count = 0;
        for (Integer number : numbers) {
            if (number <= upperBound && number >= lowerBound) {
                count++;
            }
        }
        System.out.println("Numbers: " + count);

    }

}
