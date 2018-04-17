package Var005;

public class S3_1 {

    public int[][] matriceCuSemidiagonale(int[][] matrix) {
        int n = 5;
        matrix = new int[n][n];
        int matrixIndexValue =n-1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {


                if (i +j<=n-1) {

                    matrix[i][j] = i+j+1;

                }
                else
                    matrix[i][j]= 2*n-i-j-1;


                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        return matrix;
    }
}
