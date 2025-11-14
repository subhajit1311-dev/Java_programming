package com.binSearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={12,34,56,67,89};
        int target=1;
        int ans = binarySearch(arr,target);
        if(ans==-1)
            System.out.println("The element is not found in the array");
        else
            System.out.println("The element is present in the array:"+ans);
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid])
                start=mid+1;
            else if(arr[mid]>target)
                end=mid-1;
            else
                return mid;
        }
        return -1;
    }
}
