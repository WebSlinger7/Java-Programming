import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 1st number : ");
        int num1 = input.nextInt();
        System.out.print("Enter your 2nd number : ");
        int num2 = input.nextInt();
        System.out.println("GCD between " + num1 + " and " + num2 + " is " + gcd(num1, num2));

    }
    public static int gcd(int i1, int i2){
        if(i1>i2){
            int temp = i1;
            i1 = i2;
            i2 = temp;
        }
        int answer = 0;
        for(int x = 1; x <= i1; x++){
            if (i1 % x == 0 && i2 % x ==0){
                answer =  x;
            }
        }
        return answer;
    }


}
