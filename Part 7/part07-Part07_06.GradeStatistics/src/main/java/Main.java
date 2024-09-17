
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int points = Integer.valueOf(scanner.nextLine());
            if (points == -1) {
                break;
            }
            register.addGradeBasedOnPoints(points);
        }

        System.out.println("Point average (all): " + register.averageOfPoints());
        System.out.println("Point average (passing): " + register.averageOfPassingPoints());
        System.out.println("Pass percentage: " + register.passPercentage());
        register.printGradeDistribution();
    }
}
