import java.util.Scanner;
public class PayIncrement {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    System.out.print("Enter your pay :");
    double pay = input.nextDouble();
  System.out.println("Your Pay without increment is;" + pay);
  System.out.print("Enter your score:");
 double score = input.nextDouble();
 if(score>90) {
    double new_pay = pay + (pay * 0.03);
    System.out.println("Your Pay with 3% increment is:" + new_pay);
}
else{ 
    double new_payment = pay + (pay*0.01);
    System.out.println("Your new payment after 1% increment is :" + new_payment);
}
    }
}
