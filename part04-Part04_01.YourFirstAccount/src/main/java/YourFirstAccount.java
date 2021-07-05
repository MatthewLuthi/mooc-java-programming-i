
public class YourFirstAccount {

    public static void main(String[] args) {
        Account testAccount = new Account("Test run account", 100.0);
        testAccount.deposit(20.0);
        System.out.println(testAccount);
    }
}
