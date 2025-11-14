package com.binSearch;

public class FloorOfNum {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=7;
        //floor=>greatest number which is smaller or equal to target
        int index = floor(arr,target);
        System.out.println(index);
    }
    static int floor(int[] arr ,int target)
    {
        if(target<arr[0])
            return -1;
        int start = 0;
        int end= arr.length-1;
        while(start<=end)
        {
            int mid= start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid; //arr[mid]
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;//arr[end]
    }
}
