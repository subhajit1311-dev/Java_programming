package com.array;

import java.util.Scanner;

public class MinNum {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the no of elements");
            int n = in.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements");
            for(int i=0;i<n;i++){
                arr[i] = in.nextInt();
            }
            int ans = min(arr);
            System.out.println("the max element is "+ans);
        }

        static int min(int[] arr){
            if(arr.length==0){
                return -1;
            }
            int minVal= Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<minVal){
                    minVal=arr[i];
                }
            }
            return minVal;
        }
    }

