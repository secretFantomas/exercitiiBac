package Var003;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S3_1 {

    public int[][] S3_1( int[][] matrix) {
        // Sub III ex.1 Sa se citesca de la tastatura n si sa se construiasca o matrice
        // patratica astfel incat pe diagonala principala si secundara sa aiba valoarea 1 si elementele situate
        // intre diagonale in partea superioara si inferioara sa aiba valoarea 1 si in rest valoarea 2

//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.println("Insert a number n= ");
//        int n = keyboard.nextInt();
        int n=5;

        matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (i == j || i + j == n - 1 || i < j && i + j < n || i > j && i + j >= n)
                    matrix[i][j] = 1;
                else
                    matrix[i][j] = 2;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

        return matrix;
    }

    public List<List<Integer>>  S3_1_withArrayList(int n) {
        List<List<Integer>> outer = new ArrayList<List<Integer>>();

        for (int indexLinie = 0; indexLinie < n; indexLinie++) {
            ArrayList<Integer> inner = new ArrayList<>();
            for (int indexColoana = 0; indexColoana < n; indexColoana++) {
                if (indexLinie == indexColoana || indexLinie + indexColoana == n - 1 || indexLinie < indexColoana && indexLinie + indexColoana < n || indexLinie > indexColoana && indexLinie + indexColoana >= n)
                    inner.add(1);
                else
                    inner.add(2);
                System.out.print(inner.get(indexColoana) + " ");

            }
            outer.add(inner);
            System.out.println(" ");
        }

        return outer;
    }
}
