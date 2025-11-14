package com.pattern;

import java.util.Scanner;

public class Pattern31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = in.nextInt();
        pattern31(n);
    }

    static void pattern31(int n)
    {
        int originalN= n;
        n=2*n;
        for(int row=0;row<=n;row++)
        {
            for(int col=0;col<=n;col++)
            {
                int atEveryIndex=originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }

            System.out.println();
        }
    }
}
