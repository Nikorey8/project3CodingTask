package org.example.codingTask;

public class Task10 {
    public static void main(String[] args) {
        /*
        Write a program to print out duplicate elements from an Array
        of Strings
         */

        String[] familyName = {"Korey", "Nathaniel", "Robin", "Tim", "Korey", "Rasheeia","Tim"};


        for(int i=0;i< familyName.length;i++){
            for(int j=i+1;j< familyName.length;j++)
                if(familyName[i].equals(familyName[j])){
                    System.out.println(familyName[i]);
                }

        }
    }
}
