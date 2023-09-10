import java.util.Date;

public class TheDateClass {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("The elapsed time since Jan1, 1970 is " + date.getTime() + " millisecnods ");
        System.out.println(date.toString());
    }
}
