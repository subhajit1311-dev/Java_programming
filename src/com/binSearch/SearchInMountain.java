package com.binSearch;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,4,3,2,1};
        int target =3;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int target)
    {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if(firstTry!=-1)
        {
            return firstTry;
        }
        //try to search in second half
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);

    }
    static int peakIndexInMountainArray(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<end)
        {
            int mid = start +(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in dec part of the array
                //this maybe the ans but look at left
                //this is why end!=mid
                end = mid;
            }
            else {
                //you are in asc part of the array
                start = mid+1;
                //because we know that mid+1 element>mid element

            }
        }
        //in the end,start ,start==end pointing to the largest number in the array
        //because of the above 2 checks
        return start;//or end

    }
    static int orderAgnosticBS(int[] arr,int target,int start,int end)
    {
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

