import java.util.Scanner;
public class Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.print("Enter your ticket number : ");
       int ticketnumber = input.nextInt();
       int first_digit = ticketnumber/10;
       int second_digit= ticketnumber%10;

       int lottery = (int)(Math.random()*99);
       int lottery1 = lottery/10;
       int lottery2 = lottery%10;

       
       
       
       if(lottery1 == first_digit && lottery2 == second_digit){
        System.out.println("You win $100000");

       }
       else if(lottery1 == second_digit && lottery2 == first_digit){
        System.out.println("You win $50000");

       }
       else{
        System.out.println("You lose");
       }
System.out.println("Lottery number is " + lottery);



    }
}
