import java.util.Scanner;
public class Day24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter seconds in integer");
        double seconds = input.nextDouble();
        double minutes = seconds/60;
        double remaining_seconds = seconds % 60;
        System.out.println( minutes + " minutes and " +  remaining_seconds +" seconds "  );
     

    }
}
