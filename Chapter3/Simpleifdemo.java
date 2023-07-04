import java.util.Scanner;
public class Simpleifdemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number :");
        int number = input.nextInt();
        input.close();
        if(number % 5 == 0)
        System.out.println("HiFIve");
        if(number % 2 == 0)
        System.out.println("EVen");

    }
}
