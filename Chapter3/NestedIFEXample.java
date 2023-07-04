import java.util.Scanner;
public class NestedIFEXample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x = ");
        int x = input.nextInt();
        System.out.print("y = ");
        int y = input.nextInt();
        if (x>2){
            if(y>2){

                int z = x + y;
                System.out.println("z is " + z);
            }
            
        }
else{
    System.out.println("Sorry");
}
    }
}
