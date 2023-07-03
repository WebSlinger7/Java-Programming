import java.util.*;
public class exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate : ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
        double percent = (subtotal/100)*gratuity;
        double rate = subtotal+percent;
    System.out.println("The gratuity is $"+percent + "and total is $" + rate);


    }
}
