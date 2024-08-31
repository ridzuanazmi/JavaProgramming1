
public class YourFirstAccount {

    /*
    Write a program that creates an account with a balance of 100.0, deposits 20.0 in it, and finally prints the balance. 
    NB! Perform all the operations in this exact order.
     */
    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account artosAccount = new Account("Arto's account", 100.00);
        System.out.println("Initial state");
        System.out.println(artosAccount);
        System.out.println("");
        artosAccount.deposit(20.0);
        System.out.println("");
        System.out.println("End state");
        System.out.println(artosAccount);

    }
}
