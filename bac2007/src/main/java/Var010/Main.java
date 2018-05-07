package Var010;

public class Main {

    public static int[][] S3_1() {
        int n = 5, index=1;
        int matrix[][];
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

    public static void main(String[] args) {
        S3_1();
    }

}
