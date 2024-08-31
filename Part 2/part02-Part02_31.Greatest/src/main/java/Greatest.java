
public class Greatest {
    /*
    Define a method called greatest that takes three numbers and returns the greatest of them. 
    If there are multiple greatest values, returning one of them is enough. 
    Printing will take place in the main program.
    */

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int greatest = number1;

        if (number2 > greatest) {
            greatest = number2;
        }

        if (number3 > greatest) {
            greatest = number3;
        }

        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
