

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    
    public static void printFromNumberToOne(int number) {
        for (int highest = number; highest >= 1; highest--) {
            System.out.println(highest);
        }
    }

}
