package Var010;

public class Main {

    public static int[][] S3_1() {
        int n = 5, index=1;
        int matrix[][];
        matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j;
                    System.out.print(matrix[i][j] + " ");
                    index=j+1;
                } else {
                    matrix[i][j] = index+j;
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println(" ");
        }
        return matrix;
    }

    public static void main(String[] args) {
        S3_1();
    }

}
