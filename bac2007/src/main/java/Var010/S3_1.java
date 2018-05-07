package Var010;

public class S3_1 {
    //afisare matrice

    public int[][] populareValoriInverse(int[][] matrix){
        int n = 5, index=1;
        matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = index;
                    index++;
                }
            }else {
                for (int j = n-1; j >=0; j--){
                    matrix[i][j] = index;
                    index++;
                }
            }
        }
        return matrix;

    }
}
