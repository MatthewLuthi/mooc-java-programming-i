
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nFirst = Integer.valueOf(scanner.nextLine());
        int nSecond = Integer.valueOf(scanner.nextLine());
        
        double squareRoot = Math.sqrt(nFirst+nSecond);
        System.out.println(squareRoot);
    }
}
