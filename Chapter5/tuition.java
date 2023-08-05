import java.util.Scanner;
public class tuition {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your tuition fees : ");
        double tuitionfees = input.nextDouble();
        Tuitionfess(tuitionfees);
        
    }
    public static void Tuitionfess(double n){
        int year = 0;
        while(n <= 20000 ){
            n = n + (n * 0.07);
            year++;
        }
        System.out.println("Tuition fees will be doubled in " + year + " years");
        System.out.printf("Tuition fees will be $%.2f in %2d year", n,year);
    }
}
