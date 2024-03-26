package org.example.codingTask;

public class Task7 {
    public static void main(String[] args) {
        /*
    Write a Java program to print the first numbers of the Fibonacci series
     */

        int firstTen=10;

        int first=0;
        int second =1;

        for(int i=1;i<=firstTen;++i){
            System.out.print(first+" ");
            int nextNum=first+second;
            first =second;
            second=nextNum;
        }
    }


}
