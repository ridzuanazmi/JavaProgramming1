
public class YourFirstBankTransfer {
    /*
    Write a program that:

    Creates an account named "Matthews account" with the balance 1000
    Creates an account named "My account" with the balance 0
    Withdraws 100.0 from Matthew's account
    Deposits 100.0 to "my account"
    Prints both the accounts
    */

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matthewAccount = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);
        
        matthewAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println(matthewAccount);
        System.out.println(myAccount);
    }
}
