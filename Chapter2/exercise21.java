import java.util.Scanner;
public class exercise21 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.print("Enter the length of the side of a hexagon = ");
        double length = input.nextDouble();
        double y = Math.sqrt(3);
        double Area = (3 * (y) * (length * length))/2;
        System.out.println("The Area of the Hexagon is " + Area);
    }
}