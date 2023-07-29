import java.util.Scanner;
public class TestMax {
    //Main Method
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your first number :");
        int i = input.nextInt();
        System.out.print("Enter your second number :");
        int j = input.nextInt();
        int k = max(i,j);
        int m = min(i,j);
        System.out.println("The max of " + i + " and " + j + " is " + k);
        System.out.println("The minimum of " + i + " and " + j + " is " + m);
    }
//This is my max method but should be in the same class
//It returns max of two values

public static int max(int num1, int num2){
    int result;
    if(num1 > num2){
        result = num1;
    }
    else{
        result = num2;
    }
    return result;
}
// This is my min method: To find minimum of two numbers
public static int min(int num1, int num2){
    int result;
    if(num1 < num2){
        result = num1;
    }
    else{
        result = num2;
    }
    return result;
}

}
