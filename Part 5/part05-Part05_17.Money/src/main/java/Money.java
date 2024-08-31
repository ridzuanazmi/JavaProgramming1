
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        // Calculate the total cents by adding both the euros and cents
        int newEuros = this.euros + addition.euros();
        int newCents = this.cents + addition.cents();

        // If newCents >= 100, convert the excess into euros
        if (newCents >= 100) {
            newEuros += newCents / 100;
            newCents = newCents % 100;
        }

        // Return a new Money object with the calculated euros and cents
        return new Money(newEuros, newCents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        } else if (this.euros == compared.euros()) {
            return this.cents < compared.cents();
        } else {
            return false;
        }
    }

    public Money minus(Money decreaser) {
        int totalCents = this.euros * 100 + this.cents;
        int decreaserCents = decreaser.euros() * 100 + decreaser.cents();

        int differenceCents = totalCents - decreaserCents;

        if (differenceCents < 0) {
            return new Money(0, 0);
        }

        int newEuros = differenceCents / 100;
        int newCents = differenceCents % 100;

        return new Money(newEuros, newCents);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
