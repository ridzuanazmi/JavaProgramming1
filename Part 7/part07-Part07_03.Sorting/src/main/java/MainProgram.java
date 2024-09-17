
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
//        int[] array = {3, 1, 5, 99, 3, 12};
//        System.out.println("Smallest: " + MainProgram.smallest(array));
//        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));

//        int[] numbers = {-1, 6, 9, 8, 12};
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
//        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));.
//        int[] numbers = {3, 2, 5, 4, 8};
//
//        System.out.println(Arrays.toString(numbers));//
//        MainProgram.swap(numbers, 1, 0);
//        System.out.println(Arrays.toString(numbers));//
//        MainProgram.swap(numbers, 0, 3);
//        System.out.println(Arrays.toString(numbers));
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        // Start by assuming the first element is the smallest
        int smallestIndex = 0;

        // Iterate over the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            // If the current element is smaller than the smallest so far, update the smallest index
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestIndex = startIndex;
        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < table[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int helperSwap = array[index1];
        array[index1] = array[index2];
        array[index2] = helperSwap;
    }

    public static void sort(int[] array) {
        // Print the array before sorting
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            // Find the index of the smallest element from index i onwards
            int smallestIndex = indexOfSmallestFrom(array, i);

            // Swap the current element with the smallest element
            swap(array, i, smallestIndex);

            // Print the array after each swap
            System.out.println(Arrays.toString(array));
        }
    }
}
