
public class Main {

    public static void main(String[] args) {
        SimpleDate now = new SimpleDate(29, 12, 2011);
        now.advance();
 
        System.out.println(now);
//        SimpleDate afterOneWeek = now;
//        afterOneWeek.advance(7);
//
//        System.out.println("Now: " + now);
//        System.out.println("After one week: " + afterOneWeek);
    }
}
