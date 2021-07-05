
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number?");
        int nFirst = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int nLast = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        
        for (int start = nFirst; start <= nLast; start++) {
            sum += start;
        }
        
        System.out.println("The sum is "+sum);

    }
}
