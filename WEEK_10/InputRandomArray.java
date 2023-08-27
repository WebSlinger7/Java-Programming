import java.util.Scanner;

public class InputRandomArray {
    public static void main(String[] args) {
        double [] mylist= new double [5];

        //Initialize the array with user inputs
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + mylist.length + " values ");
        for(int i = 0; i < mylist.length; i++){
            mylist[i] = Math.random()*10;
        }
        input.close();


        //Display the arrays
        for (int i = 0; i < mylist.length; i++){
            System.out.print(mylist[i] + " ");
            if (i < mylist.length - 1) {
                System.out.print(", ");
        }

    }
    }
}
