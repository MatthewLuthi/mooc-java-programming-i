
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        
        int factorial = Integer.valueOf(scanner.nextLine());
        int factorialProduct = 1;
        
        for (int i = 1; i <= factorial; i++) {
            factorialProduct *= i;
        }
        
        System.out.println("Factorial: "+factorialProduct);
    }
}
