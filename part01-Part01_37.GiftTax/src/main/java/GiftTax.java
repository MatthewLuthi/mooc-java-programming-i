
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        
        if (value < 5000) {
            System.out.println("No tax!");
        } else if (value < 25000) {
            System.out.println("Tax: "+(100+(value-5000)*.08));
        } else if (value < 55000) {
            System.out.println("Tax: "+(1700+(value-25000)*.1));
        } else if (value < 200_000) {
            System.out.println("Tax: "+(4700+(value-55000)*.12));
        } else if (value < 1_000_000) {
            System.out.println("Tax: "+(22100+(value-200000)*.15));
        } else {
            System.out.println("Tax: "+(142100+(value-1_000_000)*.17));
        }
        

    }
}
