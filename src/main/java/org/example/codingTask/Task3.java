package org.example.codingTask;

public class Task3 {
    public static void main(String[] args) {
        /* Create a 2D array of integer type where you will store the odd and even numbers.
        Develop a program which will identify/print the even numbers only.
         */

        int[][] num = {
                {23, 45, 42, 12, 46},
                {98, 34, 73, 51, 27},
                {8, 39, 15, 44, 84},
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (num[i][j] % 2 == 0) {
                    System.out.print(num[i][j]+" ");
                }
            }
            System.out.println();
        }

    }
}
