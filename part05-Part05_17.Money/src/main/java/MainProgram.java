
public class MainProgram {

    public static void main(String[] args) {
        Money firstMoneyObj = new Money(10, 0);
        Money secondMoneyObj = new Money(7, 40);
        Money thirdMoneyObj = new Money(-3, 5);
        Money fourthMoneyObj = new Money(2, 0);
        
        Money firstMinusSecond = firstMoneyObj.minus(secondMoneyObj);
        System.out.println(firstMinusSecond.cents());
        //firstMoneyObj.lessThan(thirdMoneyObj);
        //System.out.println(firstMoneyObj.lessThan(thirdMoneyObj));
        
    }
}
