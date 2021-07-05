
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        money = 1000.0;
    }

    public double eatAffordably(double payment) {
        double affordableMealCost = 2.50;

        if (payment >= affordableMealCost) {
            money += affordableMealCost;
            affordableMeals++;
            return payment - affordableMealCost;
        }

        return payment;
    }

    public double eatHeartily(double payment) {
        double heartilyMealCost = 4.30;

        if (payment >= heartilyMealCost) {
            money += heartilyMealCost;
            heartyMeals++;
            return payment - heartilyMealCost;
        }

        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        double affordableMealCost = 2.50;

        if (card.takeMoney(affordableMealCost)) {
            affordableMeals++;
            return true;
        }

        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        double heartyMealCost = 4.30;

        if (card.takeMoney(heartyMealCost)) {
            heartyMeals++;
            return true;
        }

        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
