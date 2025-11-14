package com.binSearch;

public class Mountain {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,4,3,2,1};
        int ans=peakIndexInMountainArray(arr);
        System.out.println(ans);
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
}



