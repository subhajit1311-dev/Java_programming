package com.kunal;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        //take input using for loop
        for (int i = 0; i < arr.length; i++) {
            //arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
          //  System.out.println(arr[i]+" ");
        }
        //System.out.println(Arrays.toString(arr));

        for(int num: arr){
            //System.out.println(num+" ");
        }

        String[] arr1 = new String[3];
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i]=in.next();
        }
        System.out.println(Arrays.toString(arr1));


    }
}
