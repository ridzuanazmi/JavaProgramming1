
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            // Get the Book object at index i
            Book book = books.get(i);
            // Check if the book's id matches the searchedId
            if (book.getId() == searchedId) {
                return i;  // Return the index where the book was found
            }
        }
        // If no match is found, return -1
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        int low = 0;
        int high = books.size() - 1;

        while (low <= high) {
            // Calculate the middle index
            int mid = (low + high) / 2;
            // Get the book at the middle index
            Book midBook = books.get(mid);

            // Check if the book's id matches the searchedId
            if (midBook.getId() == searchedId) {
                return mid;  // Found, return the index
            } // If searchedId is greater, ignore left half
            else if (midBook.getId() < searchedId) {
                low = mid + 1;
            } // If searchedId is smaller, ignore right half
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
