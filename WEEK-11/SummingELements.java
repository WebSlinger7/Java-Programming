public class SummingELements {
    public static void main(String[] args) {
        //Create 2D array
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        //Find sum of all elements

        int total = 0;
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                total += matrix[row][col];
            }
        }
        System.out.println("The sum is " + total);
    }
}
