package com.array;

import java.util.Scanner;

public class SearchInRange {
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
        System.out.println("enter the upper bound of the range");
        int index1 = in.nextInt();
        System.out.println("enter the lower bound of the range");
        int index2 = in.nextInt();
        int ans = searchInRange(arr,target,index1,index2);
        if(ans==-1){
            System.out.println("The target element is not found in the array");
        }
        else {
            System.out.println("the target element is found in the array in the index "+ans);
        }
    }
    static int searchInRange(int[] arr,int target,int index1,int index2){
        if(arr.length==0){
            return -1;
        }
        for(int i=index1;i<=index2;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
