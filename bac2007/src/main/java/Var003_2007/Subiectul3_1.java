package Var003_2007;

import java.util.ArrayList;
import java.util.Scanner;

public class Subiectul3_1 {


    public static void main(String[] args) {

    }

    // Sub III ex.1 Sa se citesca de la tastatura n si sa se construiasca o matrice
    // patratica astfel incat pe diagonala principala si secundara sa aiba valoarea 1 si elementele situate
    // intre diagonale in partea superioara si inferioara sa aiba valoarea 1 si in rest valoarea 2

    Scanner keyboard = new Scanner(System.in);

		System.out.println("Insert a number n= ");
    int n = keyboard.nextInt();

    int[][] matrix = new int[n][n];

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


    ArrayList <ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();

    for (int indexLinie=0; indexLinie<n; indexLinie++)
}

