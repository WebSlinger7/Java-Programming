import java.util.Scanner;
public class SlesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the purchase amount :");
        double purchaseAmount = input.nextDouble();
        input.close();
        double tax = purchaseAmount * 0.06;
     System.out.println("Sales tax is $ " + (int)(tax * 100)/100.0);   
    
    }
}
