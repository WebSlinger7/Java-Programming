import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        String message = "Welcome to Java";
        System.out.println("The length of " + message + "is" + message.length());
        System.out.println("The first character of the message is " + message.charAt(0));
        System.out.println("The message is in Uppercase:" + message.toUpperCase());
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println(name.toUpperCase());


    }
}
