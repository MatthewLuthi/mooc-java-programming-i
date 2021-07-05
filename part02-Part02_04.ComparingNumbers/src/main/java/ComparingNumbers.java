
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nFirst = Integer.valueOf(scanner.nextLine());
        int nSecond = Integer.valueOf(scanner.nextLine());
        
        if (nFirst > nSecond) {
            System.out.println(nFirst+" is greater than "+nSecond);
        } else if (nFirst < nSecond) {
            System.out.println(nFirst+" is smaller than "+nSecond);
        } else {
            System.out.println(nFirst+" is equal to "+nSecond);
        }
    }
}
