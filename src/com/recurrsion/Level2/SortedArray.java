package com.recurrsion.Level2;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr={3,1};
        if(isSorted(arr,0))
        {
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("the array is not sorted");
        }
    }
    static boolean isSorted(int[] arr,int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        if(arr[index]<arr[index+1] && isSorted(arr,index+1))
        {
            //arr are different reference variable but pointing to the same object
            return true;
        }
        return false;
    }
}
