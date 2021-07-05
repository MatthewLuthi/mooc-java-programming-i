
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        String oldestPerson = "";
        while (true) {
            String person = scanner.nextLine();
            if (person.isEmpty()) {
                break;
            }
            
            String[] personalDetails = person.split(",");
            String name = personalDetails[0];
            int age = Integer.valueOf(personalDetails[1]);
            
            if (age > oldest) {
                oldest = age;
                oldestPerson = name;
            }
        }

        System.out.println("Name of the oldest: " + oldestPerson);
    }
}
