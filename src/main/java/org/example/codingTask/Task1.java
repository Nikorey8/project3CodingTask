package org.example.codingTask;

public class Task1 {

    public static void main(String[] args) {

        /* Create a program that uses an array to store a list of temperatures
        for a week, and then use a loop to find the highest and lowest temperature
        for the week*/

        int [] temperature={97,85,45,71,102,21,67};

        int highestTemp=temperature[0];
        int lowestTemp=temperature[0];

        for(int i=1;i<temperature.length;i++){
            if(temperature[i]>highestTemp){
                 highestTemp=temperature[i];
            }
            if(temperature[i]<lowestTemp){
                lowestTemp=temperature[i];
            }
        }
        System.out.println("The highest number for the week is "+highestTemp);
        System.out.println("The lowest number for the week is "+lowestTemp);
    }
}
