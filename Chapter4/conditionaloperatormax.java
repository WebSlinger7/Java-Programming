import java.util.Scanner;
public class conditionaloperatormax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 =");
        int num1 = input.nextInt();
        int num2 = 8;
        int max = (num1 > num2)? num1 : num2;
        System.out.println("max = " + max);
    }
}
