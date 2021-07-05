
/**
 *
 * @author Matt
 */
public class PaymentCard {

    private double balance;
    
    private final double affordable;
    private final double hearty;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
        this.affordable = 2.6;
        this.hearty = 4.6;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        if (this.balance >= affordable) {
            this.balance -= affordable;
        }
    }

    public void eatHeartily() {
        if (this.balance >= hearty) {
            this.balance -= hearty;
        }
    }

    public void addMoney(double amount) {
        if (amount < 0) {
            return;
        }
        
        this.balance += amount;
        
        if (this.balance > 150) {
            this.balance = 150;
        }
    }
}
