import java.util.Scanner;
public class ComputeAngles {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the three corner points:");
        double x1= input.nextDouble();
        double y1= input.nextDouble();

        double x2= input.nextDouble();
        double y2= input.nextDouble();

        double x3= input.nextDouble();
        double y3= input.nextDouble();
        input.close();
        //Compute the three sides
        double a = Math.sqrt((x3-x2) * (x3-x2) + (y3-y2) * (y3-y2));
        double b = Math.sqrt((x3-x1) * (x3-x1) + (y3-y1) * (y3-y1));
        double c = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));

        //Compute Angles
        double A = Math.toDegrees(Math.acos(a*b - b*b - c*c) / (-2*b*c));
        double B = Math.toDegrees(Math.acos(b*b - a*a - c*c) / (-2*a*c));
        double C = Math.toDegrees(Math.acos(c*c - b*b - a*a) / (-2*a*b));

        //Display the angles
        System.out.println("The three angles are:" + A + "," + B + "and" + C);
    
    }
}
