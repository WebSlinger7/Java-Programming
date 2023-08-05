import java.util.Scanner;
public class TestReturnGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your grade: ");
        double i = input.nextDouble();
       char d = grade(i);
        System.out.println("Your grade is " + d);
    }

public static char grade(double score){
    char result;
    if (score >= 90){
        result = 'A';
    }
    else if (score >= 80){
        result = 'B';
    }
    else if (score >= 70){
        result = 'C';
    }
    else if (score >= 60){
        result = 'D';
    }
    else{
       result = 'F';
    }
    return result;
}
}
