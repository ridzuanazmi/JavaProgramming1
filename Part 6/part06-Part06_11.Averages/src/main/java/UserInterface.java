
import java.util.Scanner;

public class UserInterface {

    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution();
        System.out.println("");
        printAverages(); // Print the averages after the grade distribution
    }

    public void readPoints() {
        while (true) {
            System.out.print("Points: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            int points = Integer.valueOf(input);

            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }

            this.register.addGradeBasedOnPoints(points);
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
        
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
    
    public void printAverages() {
        // Print the average of points
        double averagePoints = register.averageOfPoints();
        if (averagePoints == -1) {
            System.out.println("Point average: -");
        } else {
            System.out.println("Point average: " + averagePoints);
        }

        // Print the average of grades
        double averageGrades = register.averageOfGrades();
        if (averageGrades == -1) {
            System.out.println("Grade average: -");
        } else {
            System.out.println("Grade average: " + averageGrades);
        }
    }
}
