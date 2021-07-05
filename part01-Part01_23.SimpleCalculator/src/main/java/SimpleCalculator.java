
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int nFirst = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int nSecond = Integer.valueOf(scanner.nextLine());
        System.out.println(nFirst+" + "+nSecond+" = "+(nFirst+nSecond));
        System.out.println(nFirst+" - "+nSecond+" = "+(nFirst-nSecond));
        System.out.println(nFirst+" * "+nSecond+" = "+(nFirst*nSecond));
        System.out.println(nFirst+" / "+nSecond+" = "+(1.0 * nFirst/nSecond));
        
    }
}
