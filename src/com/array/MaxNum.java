package com.array;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int ans = max(arr);
        System.out.println("the max element is "+ans);
    }

    static int max(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int maxVal= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
