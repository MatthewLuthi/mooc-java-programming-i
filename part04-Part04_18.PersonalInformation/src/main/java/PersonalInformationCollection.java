
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("First name: ");
            String fName = scanner.nextLine();
            
            if (fName.isEmpty()) {
                break;
            }
            
            System.out.println("Last name: ");
            String lName = scanner.nextLine();
            System.out.println("Identification number: ");
            String idNumber = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(fName, lName, idNumber));
        }
        
        for (PersonalInformation personInfo : infoCollection) {
            System.out.println(personInfo.getFirstName() + " " + personInfo.getLastName());
        }
    }
}
