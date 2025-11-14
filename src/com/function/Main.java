package com.function;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no 1:");
        int num1= in.nextInt();
        System.out.println("enter no 2");
        int num2= in.nextInt();
        int sum = num1+num2;
        System.out.println("the sum is:"+sum);

    }
}
