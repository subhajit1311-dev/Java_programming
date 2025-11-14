package com.array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("enter the target element");
        int target = in.nextInt();
        int ans = linearSearch(arr,target);
        if(ans==-1){
            System.out.println("The target element is not found in the array");
        }
        else {
            System.out.println("the target element is found in the array in the index "+ans);
        }
    }

    static int linearSearch2(int[] arr,int target){
        if(arr.length==0){
            return -1;

        }
        for(int element:arr){
            if(element==target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
