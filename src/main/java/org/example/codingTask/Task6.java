package org.example.codingTask;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
        Write a java program to check whether a given number is prime or not
         */

        int num=3;

        boolean value=false;

        for(int i=2;i<num/2;i++){
            if(num%1==0){
                value=true;
            }
        }
        if(!value){
            System.out.println(num+" is prime");
        }else{
            System.out.println(num+" is not");
        }

    }
}
