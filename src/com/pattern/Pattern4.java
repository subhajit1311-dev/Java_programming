package com.pattern;

import java.util.Scanner;

public class Pattern4 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number of rows");
            int n = in.nextInt();
            pattern4(n);
        }
        static void pattern4(int n)
        {
            for (int i = 1; i <=n ; i++) {
                //for every row run the column
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j+" ");
                }
                //when one row is printed then we need to add a new line
                System.out.println();
            }
        }

}
