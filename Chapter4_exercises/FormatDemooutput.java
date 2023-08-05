import java.util.Scanner;
public class FormatDemooutput {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your Degree :");
        int degree1 = input.nextInt();
        System.out.print("Enter your another Degree : ");
        int degree2 = input.nextInt();
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","Degrees", "Radians", "Sine", "Cosine", "Tangent" );
        double radian1 = Math.toRadians(degree1);
        double radian2 = Math.toRadians(degree2);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n",degree1, radian1, Math.sin(radian1), Math.cos(radian1), Math.tan(radian1));
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n",degree2, radian2, Math.sin(radian2), Math.cos(radian2), Math.tan(radian2));
    }
    
}
