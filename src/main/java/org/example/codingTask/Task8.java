package org.example.codingTask;

public class Task8 {
    public static void main(String[] args) {
        /*
        Maximum and minimum number in an array
         */
        int[] number = {15, 54, 8, 34, 99};

        int maxNumber = number[0];
        int minNumber = number[0];

        for (int i = 1; i < 5; i++) {
            if (number[i] > maxNumber) {
                maxNumber = number[i];
            } else if (number[i] < minNumber) {
                minNumber = number[i];
            }
        }
        System.out.println("The maximum number is "+maxNumber);
        System.out.println("The minimum number is "+minNumber);
    }
}
