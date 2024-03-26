package org.example.codingTask;

public class Task9 {
    public static void main(String[] args) {
        /*Write a java program to find the second largest number in the array*/

        int[] numbers = {46, 34, 66, 13, 78, 27};

        int largestNum = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 1; i < 6; i++) {
            if (numbers[i] > secondLargest) {
                if (numbers[i] > largestNum) {
                    secondLargest = largestNum;
                    largestNum = numbers[i];
                } else
                    secondLargest = numbers[i];
            }
        }
        System.out.println(secondLargest);


    }
}
