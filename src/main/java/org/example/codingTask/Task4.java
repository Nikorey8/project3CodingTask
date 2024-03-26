package org.example.codingTask;

public class Task4 {
    public static void main(String[] args) {
        /*Create a 2D Array of integers. Develop a program which will calculate
        the sum of even and odd numbers for that array */

        int [][] numbers ={
                {22,45,36,24},
                {32,19,24,45},
                {31,34,18,39}
        };

        int evenSum=0;
        int oddSum=0;

        for(int i=0;i< 3;i++){
            for(int j=0;j< 4;j++){
                if(numbers[i][j]%2==0){
                    evenSum+=numbers[i][j];
                }else if(numbers[i][j]%2!=0){
                    oddSum+=numbers[i][j];
                }
            }
        }
        System.out.println("The sum of even numbers is "+evenSum);
        System.out.println("The sum of odd numbers is "+oddSum);


    }
}
