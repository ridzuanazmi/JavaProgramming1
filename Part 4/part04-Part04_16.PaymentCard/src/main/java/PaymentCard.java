/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        // write code here
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        // write code here
        if (this.balance >= 2.6) {
            this.balance -= 2.6;
        }
    }

    public void eatHeartily() {
        // write code here
        if (this.balance >= 4.6) {
            this.balance -= 4.6;
        }
    }

    public void addMoney(double amount) {
        // write code here
        if (amount < 0) {
            return;
        }
        this.balance += amount;
        if (this.balance >= 150) {
            this.balance = 150;
        }
    }

    public String toString() {
        // write code here
        return "The card has a balance of " + this.balance + " euros";
    }

}
