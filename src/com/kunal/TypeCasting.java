package com.kunal;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();//int input nile automatic nie nebe
//        System.out.println(num);
        //typecasting
//        int num = (int)(67.56f);
//        System.out.println(num);

        //automatic type promotion in expressions
        int a=257;
        byte b = (byte)(a);
        //System.out.println(b);
        int num = 'A';
       // System.out.println(num);
    //java follows unicode value
    //all the byte,short ,char value convert into integer
        System.out.println(5.6-7.90);
    }
}
