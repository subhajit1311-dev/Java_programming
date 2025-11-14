package com.binSearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {34,30,23,21,17};
        int target =21;
        int ans =orderAgnosticBS(arr,target);
        if(ans==-1)
            System.out.println("The element is not found in the array");
        else
            System.out.println("The element is found in the array "+ans);
    }

    static int orderAgnosticBS(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length-1;

        //find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start]<arr[end];

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(isAsc) {
                if (target > arr[mid])
                    start = mid + 1;
                else //(arr[mid] > target)
                    end = mid - 1;
            }
            else {
                if (target > arr[mid])
                    end = mid - 1;
                else //(arr[mid] > target)
                    start = mid + 1;
            }
        }
        return -1;
    }
}
