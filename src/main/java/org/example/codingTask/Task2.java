package org.example.codingTask;

public class Task2 {

    public static void main(String[] args) {

        /* Create an array of integer values. After the array is created,
        calculate the sum of all the stored elements in that array
         */

        int [] numbers={19,18,8,23,5,15,17};

        int sum=0;

        for(int n:numbers){
            sum+=n;
        }
        System.out.println("The sum of the integers in the array is "+sum);
    }
}
