
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 9999) {
                break;
            }
            
            numbers.add(number);
        }
        
        if (numbers.size() > 0) {
            // Find the smallest number
            int nSmallest = numbers.get(0);
            // Record the index of the smallest number and add to a list in case it appears more than once
            ArrayList<Integer> nSmallestIndicies = new ArrayList<>();          
            
            for (int i = 0; i < numbers.size(); i++) {
                if (nSmallest > numbers.get(i)) {
                    nSmallest = numbers.get(i);
                    nSmallestIndicies.add(i);
                }
            }
            
            System.out.println("Smallest number: " + nSmallest);
            for (int i = 0; i < nSmallestIndicies.size(); i++) {
                System.out.println("Found at index: " + nSmallestIndicies.get(i));
            }
        }

        
    }
}
