package edu.tomer;


public class Matrices {

    public static void print(int[][] table) {
        //print -> do refactor (ctrl + alt + m )
        for (int rows = 0; rows < table.length; rows++) {
            for (int col = 0; col < table[rows].length; col++) {
                System.out.printf("%4d", table[rows][col]);
            }
            System.out.println();
        }
    }

    public static void sortDiagonal(int[][] table) {
        //sort the diagonal
        for (int iter = 0; iter < table.length; iter++) {
            for (int i = 0; i < table.length - 1 - iter; i++) {
                if (table[i][i] > table[i + 1][i + 1]) {
                    //swap
                    int temp = table[i][i];
                    table[i][i] = table[i + 1][i + 1];
                    table[i + 1][i + 1] = temp;
                }
            }
        }
    }

    public static int[][] getTable() {
        return new int[][]{{1, 2, 3, 4},
                {10, 20, 30, 40},
                {5, 10, 20, 30}
                , {1, 2, 3, 4}};
    }
}
