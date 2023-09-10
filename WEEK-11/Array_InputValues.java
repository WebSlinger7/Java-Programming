import java.util.Scanner;
public class Array_InputValues {
    public static void main(String[] args) {
        //Create a 2D Array
        int[][] matrix = new int[3][3];
        
        //Ask the user to input values in 2D array
        Scanner input = new Scanner (System.in);
        System.out.println("Enter values in " + matrix.length + " rows " + matrix[0].length + " columns: " );

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                matrix[row][col] = input.nextInt();
            }
        }
        System.out.println(matrix[0]);
        System.out.println(matrix[0][0]);

        input.close();
        //Print 2D array
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                System.out.println(matrix[row][col]);
            }
        }


    }
}
