import java.util.Scanner;
public class BodyMaxIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in Kg :");
        double weight = input.nextDouble();
        System.out.print("Enter your height in cm : ");
        double height = input.nextDouble();
        double HeightInMeter = height * 0.01;
        //Compute BMI
        double bmi = weight/(HeightInMeter * HeightInMeter);
        if(bmi<18.5){
            System.out.println("You are Underweight");

        }
        else if(bmi<25){
            System.out.println("You are Normal");

        }
        else if(bmi < 30){
            System.out.println("You ar Overweight");
        
        }
        else{
            System.out.println("You are Obese");
        }


    }
}
