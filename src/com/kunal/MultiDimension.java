package com.kunal;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDimension {
    public static void main(String[] args) {
        /*
        *  1 2 3
        *  4 5 6
        *  7 8 9
        *
        * */
        Scanner in = new Scanner(System.in);
        int[][] arr1= new int[3][3];
//        int[][] arr1 = {
//                {1,2,3},
//                {4,5},
//                {7,8,9,10}
//        };

        //take input in 2d array
        for (int row = 0; row < arr1.length; row++) {
            for(int col=0;col<arr1[row].length;col++)
            {
                arr1[row][col]=in.nextInt();
            }
        }

        for (int row = 0; row < arr1.length; row++) {
            for(int col=0;col<arr1[row].length;col++)
            {
                System.out.print(arr1[row][col]+" ");
            }
        System.out.println();
        }
//        for (int row = 0; row < arr1.length; row++) {
//            System.out.println(Arrays.toString(arr1[row]));
//        }
//        for(int[] a:arr1){
//            System.out.println(Arrays.toString(a));
//        }

//        String[] str = new String[4];
//        System.out.println(str[0]);
//        for(String element:str){
//            System.out.println(element);
//        }

    }
}
