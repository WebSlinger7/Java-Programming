import java.util.Scanner;
public class computeareawithinput {
    public static void main(String[] args) {
        // Creat a scanner object
        Scanner input = new Scanner(System.in);
        // prompt user to enter the input
        System.out.println("Enter a number fro radius :");
        double radius = input.nextDouble();
        // Compute Area
        double area = 3.14 * radius * radius;
        System.out.println("The area of radius :"+ radius + " is " + area);
    


    }
}