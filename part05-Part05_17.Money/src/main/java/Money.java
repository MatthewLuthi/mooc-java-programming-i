
public class Money {

    private static final int N_CENTS_EQUAL_TO_ONE_EURO = 100;
    
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

    public Money plus(Money addition) {
        Money newMoney = new Money(euros + addition.euros, cents + addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (euros < compared.euros) {
            return true;
        }
        
        if (euros <= compared.euros && cents < compared.cents) {
            return true;
        }
        
        return false;
    }

    public Money minus(Money decreaser) {

        int eurosDifference = euros - decreaser.euros;
        int centsDifference = cents - decreaser.cents;
        
        // If cents value becomes less than 0 then euros should decrease by 1 and should add
        // the difference to the cents value
        if (centsDifference < 0) {
            eurosDifference--;
            centsDifference += N_CENTS_EQUAL_TO_ONE_EURO;
        }

        Money newMoney = new Money(eurosDifference, centsDifference);

        if (eurosDifference < 0) {
            newMoney = new Money(0, 0);
        }

        return newMoney;

//        if (newMoney.euros < 0 || newMoney.cents < 0) {
//            newMoney = new Money(0, 0);
//        }
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
