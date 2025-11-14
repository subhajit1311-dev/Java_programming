package com.binSearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));

    }
    static int ans(int[] arr,int target)
    {
        //find the range
        //start with the box size of two
        int start=0;
        int end=1;
        //condition for the target to lie in the range
        while(target>arr[end])
        {
            int newS = end+1;
            //double the window size
            end = end+(end-start+1)*2;
            start = newS;
        }
        return binarySearch(arr,target,start,end);

    }
    static int binarySearch(int[] arr,int target,int start,int end){
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
