
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int sumBirthYears = 0;
        int count = 0;
        
        while (true) {
            String person = scanner.nextLine();
            if (person.isEmpty()) {
                break;
            }
            
            String[] personalDetails = person.split(",");
            String name = personalDetails[0];
            int birthYear = Integer.valueOf(personalDetails[1]);
            
            if (name.length() > longestName.length()) {
                longestName = name;
            }
            
            sumBirthYears += birthYear;
            count++;
        }
        
        System.out.println("Longest Name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sumBirthYears / count));
    }
}
