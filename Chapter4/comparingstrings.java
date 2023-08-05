import java.net.Socket;

public class comparingstrings {
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = "Welcome to Java";
        String s3 = "Welcome to C++";
        
        //equals
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        //compare to
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));

        //Startwith
        System.out.println(s1.startsWith("We"));
        System.out.println(s1.startsWith("We"));

        //EndWith
        System.out.println(s1.endsWith("va"));
        System.out.println(s1.endsWith("s"));

        //contain
        System.out.println(s1.contains("To"));
        System.out.println(s1.contains("to"));

    }
}
