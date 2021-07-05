
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int nFirst = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int nSecond = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int nThird = Integer.valueOf(scanner.nextLine());
        
        double result = (1.0 * nFirst + nSecond + nThird) / 3.0;
        
        System.out.println("The average is "+result);
        
        System.out.println(3 / 2 * 1.0);

    }
}
