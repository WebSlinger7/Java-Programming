import java.net.Socket;
import java.util.Scanner;
public class MajorAndYear {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter two characters ");
        String x = input.nextLine();
        char major = x.charAt(0);
        int year = x.charAt(1);

        switch(Character.toUpperCase(major)){
            case 'M' : System.out.println("Mathematics");break;
            case 'C' : System.out.println("Computer Science");break;
            case 'I' : System.out.println("Information Technology");break;
            default : System.out.println("Invalid");
        }
        switch(year){
            case '1' : System.out.println("Freshman");break;
            case '2' : System.out.println("Sophomore");break;
            case '3' : System.out.println("Junior");break;
            case '4' : System.out.println("Senior");break;
            default : System.out.println("Invalid");
        }
    }
}
