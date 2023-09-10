public class Row_Largest_Sum {
    public static void main(String[] args) {
        //Create 2D array
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        int maxofRow = 0;
        int indexofMaxRow = 0;

        //Get the sum of elements in the first row
        for(int col = 0; col < matrix[0].length; col++){
            maxofRow += matrix[0][col];
        }
       

        //Get the sum of the elements in other rows
        for(int row = 1; row < matrix.length; row++){
             int totalOfThis = 0;
            for(int col = 0; col < matrix[0].length; col++){
                totalOfThis += matrix[row][col];
            }
            if(totalOfThis > maxofRow){
                maxofRow = totalOfThis;
                indexofMaxRow = row;
            }
        }
        System.out.println("Row " + indexofMaxRow + " has the maximum sum of " + maxofRow);
    }
}
