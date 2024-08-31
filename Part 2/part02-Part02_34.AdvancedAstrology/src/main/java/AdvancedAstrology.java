
public class AdvancedAstrology {
    /*
    Part 1: Define a method called printSpaces(int number) that produces the number of spaces specified by number. 
            The method does not print the line break.
    Part 2: Create a method called printTriangle(int size) that uses printSpaces and printStars to print the correct triangle
    Part 3: Define a method called christmasTree(int height) that prints the correct Christmas tree. 
            The Christmas tree consists of a triangle with the specified height as well as the base. 
            The base is two stars high and three stars wide, and is placed at the center of the triangle's bottom. 
            The tree is to be constructed by using the methods printSpaces and printStars.
    */

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1); 
        }
        for (int i = 1; i <= 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
