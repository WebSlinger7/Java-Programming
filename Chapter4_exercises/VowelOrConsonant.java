import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your letter : ");
        char letter = input.next().charAt(0);
        if(Character.isLetter(letter)){
            char lower = Character.toLowerCase(letter);
            if(lower == 'a' ||lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u'){
                System.out.println("" + lower + " is a vowel");
            }
            else{
                System.out.println("" + letter + " is a consonant");
            }
        
        }
        else{
            System.out.println("" + letter + " is an invalid input");
        }
    }
}
