package com.pattern;

import java.util.Scanner;

public class Pattern28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = in.nextInt();
        pattern28(n);
    }
    static void pattern28(int n)
    {
        for (int i = 1; i <=2*n-1 ; i++) {
            int totalColsInRow;
            int totalSpacesInRow;
            //for print the spaces
            if(i>n)
            {
                totalSpacesInRow =i-n;
            }
            else
            {
                totalSpacesInRow =n-i;
            }
            for(int j=1;j<=totalSpacesInRow;j++){
                System.out.print(" ");
            }
             //for print the star
            if(i>n){
                totalColsInRow =2*n-i;
            }
            else {
                totalColsInRow =i;
            }
            for( int j=1;j<=totalColsInRow;j++){
                System.out.print("* ");
            }

            //when one row is printed then we need to add a new line
            System.out.println();
        }

    }
}
