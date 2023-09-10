public class RandomShuffling {
    public static void main(String[] args) {
        int [][] matrix = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};
        // Generate random indexex 
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                int i1 = (int)(Math.random()*matrix.length);
                int j1 = (int)(Math.random()*matrix[0].length);

                //Swap matrix [i][j] with matrix[i1][j1]

                int temp = matrix[row][col];
                matrix[row][col] = matrix[i1][j1];
                matrix[i1][j1] = temp;

            }
        }
        //Print your array after shuffling
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
        
    }
}
