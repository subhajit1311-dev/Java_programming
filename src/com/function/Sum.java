package com.function;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //sum();
        int ans = sum2();
        System.out.println(ans);

    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter no 1:");
        int num1= in.nextInt();
        System.out.println("enter no 2");
        int num2= in.nextInt();
        int sum1 = num1+num2;
        return sum1;
    }
    static void sum()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no 1:");
        int num1= in.nextInt();
        System.out.println("enter no 2");
        int num2= in.nextInt();
        int sum = num1+num2;
        System.out.println("the sum is:"+sum);

    }
}
