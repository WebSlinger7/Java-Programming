import java.util.Scanner;
public class Studentsmajor {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter two characters : ");
        String TwoCharacters = input.nextLine();
        major(TwoCharacters);

    }
    public static void major(String x){
        if(x.charAt(0) == 'M' && x.charAt(1) == 1){
            System.out.println("Major is Mathetic Freshman");
        }
        else if(x.charAt(0) == 'M' && x.charAt(1) == 2){
            System.out.println("Major is Mathetic Sophomore");
        }
        else if(x.charAt(0) == 'M' && x.charAt(1) == 3){
            System.out.println("Major is Mathetic Junior");
        }
        else if(x.charAt(0) == 'M' && x.charAt(1) == 4){
            System.out.println("Major is Mathetic Senior");
        }
        else if(x.charAt(0) == 'C' && x.charAt(1) == 1){
            System.out.println("Major is Computer Science freshman");
        }
        else if(x.charAt(0) == 'C' && x.charAt(1) == 2){
            System.out.println("Major is Computer Science Sophomore");
        }
        else if(x.charAt(0) == 'C' && x.charAt(1) == 3){
            System.out.println("Major is Computer Science Junior");
        }
        else if(x.charAt(0) == 'C' && x.charAt(1) == 4){
            System.out.println("Major is Computer Science Senior");
        }
        else if(x.charAt(0) == 'I' && x.charAt(1) == 1){
            System.out.println("Major is Information Technology Freshman");
        }
        else if(x.charAt(0) == 'I' && x.charAt(1) == 2){
            System.out.println("Major is Information Technology Sophomore");
        }
        else if(x.charAt(0) == 'I' && x.charAt(1) == 3){
            System.out.println("Major is Information Technology Junior");
        }
        else if(x.charAt(0) == 'I' && x.charAt(1) == 4){
            System.out.println("Major is Information Technology Senior");
        }
        else{
            System.out.println("Invalid");
        }
        

    }
}
