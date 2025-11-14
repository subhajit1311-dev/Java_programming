package com.binSearch;

public class CellingOfNum {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        //celling-> smallest element in the array greater than or equal to target
        int ans = celling(arr,target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] arr,char target){
        int n =arr.length;
        int start=0;
        int end =arr.length-1;
        while(start<=end)
        {
            int mid= start+(end-start)/2;
            if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return arr[start % arr.length];//end ans start =>condition violated
        //so it is arr[start] or arr[end+1]
    }

    static int celling(int[] arr,int target)
    {
        if(target>arr[arr.length-1])
            return -1;
        int start=0;
        int end =arr.length-1;
        while(start<=end)
        {
            int mid= start+(end-start)/2;
            if(arr[mid]==target) {
                return arr[mid];
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return arr[start];//end ans start =>condition violated
        //so it is arr[start] or arr[end+1]
    }

}
