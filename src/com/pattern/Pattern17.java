package com.pattern;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = in.nextInt();
        pattern17(n);
    }

    static void pattern17(int n){
        for(int row=1;row<=2*n-1;row++){
            //for spaces
            int noOfSpacesInRow;
            if(row>n){
                noOfSpacesInRow =  row-n;
            }
            else{
                noOfSpacesInRow = n-row;
            }
            for(int col=1;col<=noOfSpacesInRow;col++)
            {
                System.out.print(" ");
            }

            int totalColsInRow;
            //for print the star
            if(row>n){
                totalColsInRow =2*n-row;
            }
            else {
                totalColsInRow =row;
            }
            for(int col=totalColsInRow;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=totalColsInRow;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

}
