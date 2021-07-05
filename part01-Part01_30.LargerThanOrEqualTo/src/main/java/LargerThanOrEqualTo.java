
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int nFirst = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int nSecond = Integer.valueOf(scan.nextLine());
        
        if (nFirst == nSecond) {
            System.out.println("The numbers are equal!");
        } else if (nFirst > nSecond) {
            System.out.println("Greater number is: "+nFirst);
        } else {
            System.out.println("Greater number is: "+nSecond);
        }
    }
}
