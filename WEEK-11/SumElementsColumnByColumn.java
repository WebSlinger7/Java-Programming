public class SumElementsColumnByColumn {
    public static void main(String[] args) {
        double [][] matrix = {{1.5, 2, 3, 4},
                              {5.5, 6, 7, 8},
                              {9.5, 1, 3, 1}};

        int total = 0;
        for(int col = 0; col<matrix[0].length; col++){
            for(int row = 0; row<matrix.length; row++){
                total += matrix[col][row];
            }
        }
        for(int col = 0; col<matrix[0].length; col++){
            for(int row = 0; row<matrix.length; row++){
            System.out.println("The sum of col " + matrix[col] + " is " + total);
            }
        }
        System.out.println();
    }
}
 